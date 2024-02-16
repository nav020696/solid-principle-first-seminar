package homework.core.impl;

import homework.core.Report;
import homework.core.User;

import java.io.FileWriter;
import java.io.IOException;

public class FileReport extends Report {
    @Override
    public void report(User user) {
        try(FileWriter writer = new FileWriter("file.txt")){
            writer.write("Report for user: " + user.getName() + "\n");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
