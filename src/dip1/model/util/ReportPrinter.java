package dip1.model.util;

import dip1.model.Printer;
import dip1.model.ReportItem;

import java.util.Collection;

public class ReportPrinter implements Printer {
    public void output(Collection<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
