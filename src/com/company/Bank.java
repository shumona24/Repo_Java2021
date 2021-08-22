package com.company;

public class Bank {
    import java.util.Scanner;
    public static void main(String[] args) {

        private String name;
        private String ssn;
        private String phone;
        private String account_no;
        private long balance;

        Scanner KB = new Scanner(System.in);

        //method to open an account
        public void openAccount() {

            System.out.print("Enter Name: ");
            name = KB.next();
            System.out.print("Enter SSN: ");
            ssn = KB.next();
            System.out.print("Enter phone number: ");
            phone = KB.next();
            System.out.print("Enter account number: ");
            account_no = KB.next();

            System.out.print("Enter Balance: ");
            balance = KB.nextLong();
        }

        //method to display account details
        public void showAccount() {
            System.out.println("Name -"+name + "\nSSN -" + ssn +"\nPhone -" + phone+" \nAccount No-" + account_no+"\nBalance-"+balance);
        }

        //method to deposit money
        public void deposit() {
            long amt;
            System.out.println("Enter Amount U Want to Deposit : ");
            amt = KB.nextLong();
            balance = balance + amt;
        }

        //method to withdraw money
        public void withdrawal() {
            long amt;
            System.out.println("Enter Amount U Want to withdraw : ");
            amt = KB.nextLong();
            if (balance >= amt) {
                balance = balance - amt;
            } else {
                System.out.println("Less Balance..Transaction Failed..");
            }
        }

        //method to search an account number
        public boolean search(String acn) {
            if (account_no.equals(acn)) {
                showAccount();
                return (true);
            }
            return (false);
        }
    }

}
