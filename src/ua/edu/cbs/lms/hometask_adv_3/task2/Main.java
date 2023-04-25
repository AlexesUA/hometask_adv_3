package ua.edu.cbs.lms.hometask_adv_3.task2;

import ua.edu.cbs.lms.hometask_adv_3.errorshandling.ErrorsHandling;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        String fileName = System.getProperty("user.dir").replace("\\", "/") +
                "/src/ua/edu/cbs/lms/hometask_adv_3/task2/sometest.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Some text for write to the file.");
            writer.flush();
        } catch (Exception error) {
            ErrorsHandling.errorsHandling(error);
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception error) {
            ErrorsHandling.errorsHandling(error);
        }
    }
}
