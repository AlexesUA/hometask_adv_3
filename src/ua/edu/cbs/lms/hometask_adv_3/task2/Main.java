package ua.edu.cbs.lms.hometask_adv_3.task2;

import ua.edu.cbs.lms.hometask_adv_3.errorshandling.ErrorsHandling;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Це тестовий рядок даних.");
            writer.flush();
        } catch (Exception error) {
            ErrorsHandling.errorsHandling(error);
        }


        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception error) {
            ErrorsHandling.errorsHandling(error);
        }
    }
}
