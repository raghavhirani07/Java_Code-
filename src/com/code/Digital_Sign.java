package com.code;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Scanner;
public class Digital_Sign {
    private static final String SIGNING_ALGORITHM = "SHA256withRSA";
    private static final String RSA = "RSA";

    public static byte[] createDigitalSignature(byte[] input, PrivateKey key) throws Exception
    {
        Signature signature = Signature.getInstance(SIGNING_ALGORITHM);
        signature.initSign(key);
        signature.update(input);
        return signature.sign();
    }
    public static KeyPair generateRSAKeyPair() throws Exception
    {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA);
        keyPairGenerator.initialize(2048, secureRandom);
        return keyPairGenerator.generateKeyPair();
    }
    public static boolean verifyDigitalSignature(byte[] input, byte[] signatureToVerify, PublicKey key) throws Exception
    {
        Signature signature = Signature.getInstance(SIGNING_ALGORITHM);
        signature.initVerify(key);
        signature.update(input);
        return signature.verify(signatureToVerify);
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the message to sign: ");
        String input = sc.nextLine();
        sc.close();
        KeyPair keyPair = generateRSAKeyPair();
        byte[] signature = createDigitalSignature(input.getBytes(), keyPair.getPrivate());
        System.out.println("Signature Value:");
        for (byte b : signature)
        {
            System.out.printf("%02X", b);
        }
        System.out.println();
        boolean isVerified = verifyDigitalSignature(input.getBytes(), signature, keyPair.getPublic());
        System.out.println("Verification: " + isVerified + "\n");
    }
}
