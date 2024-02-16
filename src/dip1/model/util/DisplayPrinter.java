package dip1.model.util;

import dip1.model.Printer;
import dip1.model.ReportItem;

import java.util.Collection;

public class DisplayPrinter implements Printer {
    public void output(Collection<ReportItem> items) {
        System.err.println("Output to display");
        for (ReportItem item : items) {
            System.out.format("DISPLAY %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
