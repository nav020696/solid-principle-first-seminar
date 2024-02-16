package dip1.model;

import java.util.Collection;

public class Report{
    private Collection<ReportItem> items;	// report data

    public Report(Collection<ReportItem> items) {
        this.items = items;
    }

    public void output(Printer printer){
        printer.output(items);
    }
}
