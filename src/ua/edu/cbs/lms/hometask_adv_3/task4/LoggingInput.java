package ua.edu.cbs.lms.hometask_adv_3.task4;

import ua.edu.cbs.lms.hometask_adv_3.errorshandling.ErrorsHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LoggingInput {
    private final String pathLogFile = System.getProperty("user.dir").replace("\\", "/") +
            "/src/ua/edu/cbs/lms/hometask_adv_3/task4/logfile.txt";

    public void addLineInFile(String line){
        fileWriter(line + "\n", true);
    }

    public void printFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(pathLogFile))){
            String readingLine;
            while ((readingLine = reader.readLine()) != null){
                System.out.println(readingLine);
            }
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }

    public void clearFile(){
        fileWriter("", false);
    }

    private void fileWriter(String line, boolean isRewrite){
        try(FileWriter writer = new FileWriter(pathLogFile,isRewrite)){
            writer.write(line);
            writer.flush();
        }catch (Exception error){
            ErrorsHandling.errorsHandling(error);
        }
    }
}
