package ua.edu.cbs.lms.hometask_adv_3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        LoggingInput logging = new LoggingInput();

        do {
            System.out.print("Enter line for added to logg file (enter \"quit\" for finish): ");
            String addedLine = scInput.nextLine();
            if(addedLine.toLowerCase().equals("quit")) break;
            logging.addLineInFile(addedLine);

            System.out.println("\n\nFile content:");
            logging.printFile();

        }while(true);

        System.out.println("\n\nFinish file content:");
        logging.printFile();

        logging.clearFile();
        System.out.println("\n\nFile content after cleaning:");
        logging.printFile();

    }
}
