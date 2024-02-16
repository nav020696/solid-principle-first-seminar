package homework.core.impl;

import homework.core.Report;
import homework.core.User;

public class TerminalReport extends Report {
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}
