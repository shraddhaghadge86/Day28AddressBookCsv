package com.bridgelabz;

//import com.opencsv.exceptions.CsvDataTypeMismatchException;
//import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.Scanner;

public class AddressBookMain extends AddressBook{
    static int option;
    CSVOperation csvOperation = new CSVOperation();
    public void menu() throws Exception{
        AddressBookMain addressBook = new AddressBookMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: (Enter the respective number)\n1. Add contact 2. Edit contact 3. Delete 4. Display 5. Search by City or State " +
                "6. Count of person in city or state\n7. Dictionary of person by city and state 8. Sort by 9. Write the contacts in a file" +
                "10. Read the contacts from the file 11. Write into CSV file 12. Read from CSV 13. Exit");
        option = sc.nextInt();
        switch(option) {
            case 1:
                addressBook.uc1_CreatingContact();
                addressBook.uc2_addingContacts();
                addressBook.menu();
                break;
            case 2:
                System.out.println("Enter the first name to search and edit contact with first name");
                addressBook.searchByName = sc.next();
                addressBook.uc3_editContacts();
                addressBook.menu();
                break;
            case 3:
                System.out.println("Enter the first name to search and edit contact with first name");
                addressBook.searchByName = sc.next();
                addressBook.uc4_deleteContact();
                addressBook.menu();
            case 4:
                System.out.println("Enter the contact's first name to display");
                addressBook.searchByName = sc.next();
                for(int i = 0; i < contacts.size(); i++) {
                    if(contacts.get(i).getF_name().equalsIgnoreCase(addressBook.searchByName)) {
                        System.out.println(contacts.get(i));
                        addressBook.menu();
                    }
                    else {
                        System.out.println("Oops, can't found the name. Try again");
                        addressBook.menu();
                    }
                }
                break;
            case 5:
                System.out.println("1. Search by city 2. Search by state");
                int option2 = sc.nextInt();
                if(option2 == 1) {
                    System.out.println("Enter the city name to search");
                    String citySearch = sc.next();
                    addressBook.uc8_searchByCity(citySearch).forEach(x -> System.out.println(x));
                }
                else if(option2 == 2) {
                    System.out.println("Enter the state name to search");
                    String stateSearch = sc.next();
                    addressBook.uc8_searchByState(stateSearch).forEach(x -> System.out.println(x));
                }
                menu();
                break;
            case 6:
                System.out.println("1. count of city 2. Search of state");
                int option3 = sc.nextInt();
                if(option3 == 1) {
                    System.out.println("Enter the city name");
                    String citySearch = sc.next();
                    addressBook.uc10_CountByCity(citySearch);
                }
                else if(option3 == 2) {
                    System.out.println("Enter the state name");
                    String stateSearch = sc.next();
                    addressBook.uc10_countByState(stateSearch);
                }
                menu();
                break;
            case 7:
                System.out.println("1. dictionary of city and it's persons 2. dictionary of state and it's persons");
                int option4 = sc.nextInt();
                if(option4 == 1) {
                    System.out.println("Enter the city name");
                    String cityPerson = sc.next();
                    addressBook.uc9_dictionaryOfPersonByCity(cityPerson);
                }
                else if(option4 == 2) {
                    System.out.println("Enter the state name");
                    String StatePerson = sc.next();
                    addressBook.uc9_dictionaryOfPersonByState(StatePerson);
                }
                menu();
                break;
            case 8:
                System.out.println("1. Sort by name 2. Sort by city 3. Sort by state 4. Sort by zip");
                int option5 = sc.nextInt();
                if(option5 == 1)
                    addressBook.uc11_sortByName();
                else if (option5 == 2) {
                    addressBook.uc12_sortByCity();
                }
                else if (option5 == 3) {
                    addressBook.uc12_sortByState();
                }
                else if (option5 == 4) {
                    addressBook.uc12_sortByZip();
                }
                else
                    System.out.println("Invalid option");
                break;
            case 9:
                try (FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Desktop\\243-rfp\\AddressBookCSV\\src\\main\\java\\com\\brideglabz\\addressbookcsv\\AddressBook.txt")) {
                    for(Contacts values: contacts ) {
                        fileWriter.write(values.toString());
                    }
                }
                menu();
                break;
            case 10:
                File file1 = new File("C:\\Users\\User\\Desktop\\243-rfp\\AddressBookCSV\\src\\main\\java\\com\\brideglabz\\addressbookcsv\\AddressBook.txt");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                String values1;
                while ((values1 = bufferedReader.readLine()) != null) {
                    System.out.println(values1);
                }
                menu();
                break;
            case 11:
                csvOperation.csvWriter(contacts);
                menu();
                break;
            case 12:
                csvOperation.csvReader();
                menu();
                break;
            case 13:
                System.exit(0);
            default:
                System.out.println("Invalid option");
        }
    }
//    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
public static void main(String[] args) throws Exception{

    System.out.println("Welcome to day 9 address book program");
        AddressBookMain main = new AddressBookMain();
        main.menu();
    }
}
