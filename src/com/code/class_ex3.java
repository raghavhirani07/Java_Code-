package com.code;

import java.util.ArrayList;

public class class_ex3 {
    public static void main(String[] args) {
        Client[] clients =new Client[2];
        clients[0]=new Client (100,"raghav","9645214565");
        clients[1]=new Client (200,"jenil","4646464676");
        clients[0].addAccount (new Account (1,45222,1.5));
        clients[0].addAccount (new Account (2,50000,2.5));
        clients[0].addAccount (new Account (3,15000,3.5));
        clients[1].addAccount (new Account (4,0,5.5));
        clients[1].addAccount (new Account (3,110000,5.5));
        System.out.println (clients[0].toString ());
        System.out.println (clients[1].toString ());
    }
    public static class Client {
        private int id;
        private String name;
        private String phone;
        private ArrayList<Account> accounts;

        Client(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            accounts = new ArrayList<> ();
        }

        public boolean addAccount(Account account) {
            accounts.add (account);
            return true;

        }

        public boolean removeAccount(int accountId) {
            for (Account account : accounts) {
                if (account.getId () == accountId) {
                    accounts.remove (account);
                    return true;

                }

            }
            return false;
        }

        public String toString() {
            String s = this.id + " " + this.name + " " + this.phone + "\n";
            for (Account account : accounts) {
                s += account.toString () + "\n";
            }
            return s;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public ArrayList<Account> getAccounts() {
            return accounts;
        }

        public void setAccounts(ArrayList<Account> accounts) {
            this.accounts = accounts;
        }
    }
}
