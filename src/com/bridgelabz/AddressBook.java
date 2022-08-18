package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();
        Contact contact1 =addressBook.createContact();
        System.out.println(contact1);
    }
    Contact createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstname = sc.next();
        System.out.println("Enter last name");
        String lastName=sc.next();
        System.out.println("Enter address");
        String address=sc.next();
        System.out.println("Enter city");
        String city=sc.next();
        System.out.println("Enter state");
        String state=sc.next();
        System.out.println("Enter ZipCode");
        int zipCode=sc.nextInt();
        System.out.println("Enter phoneNumber");
        long phoneNumber=sc.nextLong();
        System.out.println("Enter Email");
        String email=sc.next();
        System.out.println("Created new contact\n");
        Contact contact = new Contact(firstname,lastName,address,city,state,zipCode,phoneNumber,email);
        return contact;
    }
}
