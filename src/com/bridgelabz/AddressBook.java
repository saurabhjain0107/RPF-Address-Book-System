package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList <Contact> AddressBook=new ArrayList();
    Contact contact;
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook addressBook=new AddressBook();
        Contact contact=addressBook.createContact();
        addressBook.addContact(contact);
        System.out.println(contact);

        System.out.println("enter name to edit contact");
        String name=sc.next();
        addressBook.editContact(name);
        System.out.println(contact);
        addressBook.deleteContact();
    }

    Contact createContact(){
        System.out.println("Enter first name");
        String firstName=sc.next();
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

        Contact contact=new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        System.out.println("created new contact");
        return contact;
    }

    void addContact(Contact contact){
        AddressBook.add(contact);
        System.out.println("contact added to AddressBook");
    }
    void editContact(String name){
        for (Contact contact : AddressBook){
            if (contact.firstName.equalsIgnoreCase(name)) {
                System.out.println("Enter first name");
                contact.firstName=sc.next();
                System.out.println("Enter last name");
                contact.lastName=sc.next();
                System.out.println("Enter address");
                contact.address=sc.next();
                System.out.println("Enter city");
                contact.city=sc.next();
                System.out.println("Enter state");
                contact.state=sc.next();
                System.out.println("Enter ZipCode");
                contact.zipCode=sc.nextInt();
                System.out.println("Enter phoneNumber");
                contact.phoneNumber=sc.nextLong();
                System.out.println("Enter Email");
                contact.email=sc.next();
                System.out.println("contact updated successfully.");
                break;
            }
        }
    }
    void deleteContact(){
        System.out.println("Enter name to delete contact ");
        String name = sc.next();
        for(Contact contact : AddressBook){
            if(contact.firstName.equalsIgnoreCase(name)){
                AddressBook.remove(contact);
                System.out.println("contact delete ");
                break;
            }
        }
    }
}
