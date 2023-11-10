package com.code;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.PrivateKey;
import javax.crypto.KeyAgreement;

public class Diffie_Hellman {

    public static void main(String[] args) throws Exception {
        KeyPair aliceKeyPair = generateKeyPair();
        KeyPair bobKeyPair = generateKeyPair();
        PublicKey alicePublicKey = aliceKeyPair.getPublic();
        PublicKey bobPublicKey = bobKeyPair.getPublic();
        KeyAgreement aliceKeyAgreement = performKeyAgreement(aliceKeyPair.getPrivate(), bobPublicKey);
        KeyAgreement bobKeyAgreement = performKeyAgreement(bobKeyPair.getPrivate(), alicePublicKey);
        byte[] aliceSharedSecret = aliceKeyAgreement.generateSecret();
        byte[] bobSharedSecret = bobKeyAgreement.generateSecret();
        System.out.println("Alice's shared secret: " + bytesToHex(aliceSharedSecret));
        System.out.println("Bob's shared secret: " + bytesToHex(bobSharedSecret));

        if (bytesToHex(aliceSharedSecret).equals(bytesToHex(bobSharedSecret))) {
            System.out.println("Shared secrets match. Key exchange successful!");
        } else {
            System.out.println("Shared secrets do not match. Key exchange failed.");
        }
    }
    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DiffieHellman");
        keyPairGenerator.initialize(2048); // Key size (bits)
        return keyPairGenerator.generateKeyPair();
    }
    public static KeyAgreement performKeyAgreement(PrivateKey privateKey, PublicKey publicKey) throws Exception {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        return keyAgreement;
    }
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}
