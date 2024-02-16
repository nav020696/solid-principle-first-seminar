package homework;

import homework.core.User;
import homework.core.impl.FileReport;
import homework.core.impl.Persister;
import homework.core.impl.TerminalReport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartProgram {
    public void run(){
        User user = new User(prompt("Введите имя пользователя"));
        TerminalReport terminalReport = new TerminalReport();
        terminalReport.report(user);
        FileReport fileReport = new FileReport();
        fileReport.report(user);
        Persister persist = new Persister();
        persist.save(user);
    }

    private String prompt(String message){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(message);
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
