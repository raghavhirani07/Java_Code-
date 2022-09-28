package com.code;

public class Expection_2 {
    public static void main(String[] args) throws Exception {
        //* Here we learn about throws

            print_me ();
    }

    public static void print_me() throws Exception {
        throw new Exception ("just Exception");
    }
}
