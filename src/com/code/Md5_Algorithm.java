package com.code;

import java.security.MessageDigest;
public class Md5_Algorithm {
    public static void main(String[] args) {
        String message = "Hello, MD5!"; // Message to be hashed

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageBytes = message.getBytes();
            byte[] digest = md.digest(messageBytes);

            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }
            System.out.println("Original message: " + message);
            System.out.println("MD5 hash: " + hexString.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
