package com.code;
import java.security.MessageDigest;

public class SHA_Algorithm {

    public static void main(String[] args) {
        String message = "Hello, SHA-1!"; // Message to be hashed

        try {
            // Create an SHA-1 message digest instance
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

            // Calculate the SHA-1 hash of the message
            byte[] messageBytes = message.getBytes();
            byte[] digest = sha1.digest(messageBytes);

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println("Original message: " + message);
            System.out.println("SHA-1 hash: " + hexString.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
