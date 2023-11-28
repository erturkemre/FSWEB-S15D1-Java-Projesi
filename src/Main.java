import model.Contact;
import model.GroceryList;
import model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do {
            System.out.println("Yapılacak işlem (0:quit, 1:ekleme, 2:çıkarma)");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("elemanları girin");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("elemanları girin");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;

            }
            groceryList.printSorted();
        }while (choice != 0);
        scanner.close();


        Contact mehmet = new Contact("mehmet","234235443");
        Contact ahmet = new Contact("ahmet","33333333");
        Contact ayse = new Contact("ayşe","111111112");
        Contact murat = new Contact("murat","3331123322");


        MobilePhone mobilePhone = new MobilePhone("2323423422");
        mobilePhone.addNewContact(mehmet);
        mobilePhone.addNewContact(ahmet);
        mobilePhone.addNewContact(ayse);
        mobilePhone.addNewContact(murat);
        System.out.println("-- initial contacts started");
        mobilePhone.printContacts();
        System.out.println("-- initial contacts ended");

        System.out.println("update contacts started");
        boolean updateResult = mobilePhone.updateContact(ahmet, new Contact("ahmet", "444444"));
        mobilePhone.printContacts();
        System.out.println("update contacts ended:"+updateResult);


        System.out.println("query started");
        Contact contact = mobilePhone.queryContact("ayşe");
        if(contact != null){
            System.out.println("query ended: "+contact.getName() +"--"+ contact.getPhoneNumber());
        }
        else{
            System.out.println("result null for query");
        }



        System.out.println("find contact 1 started");
        int indexResult = mobilePhone.findContact(ahmet);
        System.out.println("find contact 1 ended: "+indexResult);

        System.out.println("find contact 2 started");
        int indexResult2 = mobilePhone.findContact("mehmet");
        System.out.println("find contact 2 ended : "+indexResult2);
    }
}