package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryProgram {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Book[] inventory = new Book[20];
        int bookCounter = 20;
        loadInventory(inventory, bookCounter);
        String checkedOutTo = "";
        boolean isCheckedOut = false;

        boolean isRunning = true;


        System.out.print("""
                              *---------------------------------*
                              * Welcome to the Goblin's Library *
                              """);

        while (isRunning) {
            System.out.print("""
                   *---------------------------------*
                   * What would you like to do?      *
                   * 1 - See available books         *
                   * 2 - See checked out books       *
                   * 3 - Exit                        *
                   *                                 *
                   *---------------------------------*
                   \s""");
            System.out.print("Choose your option: ");
            int menuCommand = input.nextInt();

            switch (menuCommand) {
                case 1 -> showAvailableBooks(inventory, bookCounter);

                case 2 -> System.out.println("""
                                                 Show checked out books with the name of the person who checked out
                                                 prompt for:
                                                 1 - Check in a book (ask for book ID and check in the book and go back to main menu after book is checked out)
                                                 2 - Go back to main menu""");
                case 3 -> isRunning = false;





            }

        }
        System.out.println("✨Thank you for using the Goblin's Library✨");


        // display menu
        //get and process users choice






    }



    public static Book[] loadInventory(Book[] inventory, int bookCounter) {

        Book book1 = new Book (1, "978-1-50-116193-3", "The Seven Husbands of Evelyn Hugo");
        Book book2 = new Book (2, "978-1-25-030146-5", "Red, White & Royal Blue");
        Book book3 = new Book (3, "978-1-25-021973-0", "They Both Die at the End");
        Book book4 = new Book (4, "978-1-25-030044-4", "In Other Lands");
        Book book5 = new Book (5, "978-0-06-242974-4", "Simon vs. the Homo Sapiens Agenda");
        Book book6 = new Book (6, "978-1-25-023106-0", "The House in the Cerulean Sea");
        Book book7 = new Book (7, "978-1-25-021243-4", "Heartstopper Volume 1");
        Book book8 = new Book (8, "978-0-06-293215-4", "I Kissed Shara Wheeler");
        Book book9 = new Book (9, "978-1-25-077624-6", "Cemetery Boys");
        Book book10 = new Book (10, "978-0-39-959613-5", "Call Me By Your Name");
        Book book11 = new Book (11, "978-1-25-031273-7", "Fence Volume 1");
        Book book12 = new Book (12, "978-0-52-557382-5", "Carry On");
        Book book13 = new Book (13, "978-1-25-062272-5", "One Last Stop");
        Book book14 = new Book (14, "978-0-59-334762-6", "Loveless");
        Book book15 = new Book (15, "978-1-25-031243-0", "Song of Achilles");
        Book book16 = new Book (16, "978-0-14-303943-3", "Giovanni's Room");
        Book book17 = new Book (17, "978-1-64-129229-5", "Felix Ever After");
        Book book18 = new Book (18, "978-0-06-301215-0", "You Should See Me in a Crown");
        Book book19 = new Book (19, "978-1-25-078765-5", "Last Night at the Telegraph Club");
        Book book20 = new Book (20, "978-0-39-958615-0", "Delilah Green doesn't care");

        inventory[0] = book1;
        inventory[1] = book2;
        inventory[2] = book3;
        inventory[3] = book4;
        inventory[4] = book5;
        inventory[5] = book6;
        inventory[6] = book7;
        inventory[7] = book8;
        inventory[8] = book9;
        inventory[9] = book10;
        inventory[10] = book11;
        inventory[11] = book12;
        inventory[12] = book13;
        inventory[13] = book14;
        inventory[14] = book15;
        inventory[15] = book16;
        inventory[16] = book17;
        inventory[17] = book18;
        inventory[18] = book19;
        inventory[19] = book20;


        return inventory;


    }


    public static void showAvailableBooks(Book[] inventory, int bookCounter){
        for (int i = 0; i < bookCounter; i++) {
            if (!inventory[i].getIsCheckedOut()) {
                System.out.printf("----------------------------------------------------------------------%n");
                System.out.printf("|%-2d| %-20s | %-40s |%n", inventory[i].getId(), inventory[i].getIsbn(), inventory[i].getTitle());


            }
        }
    }


}
