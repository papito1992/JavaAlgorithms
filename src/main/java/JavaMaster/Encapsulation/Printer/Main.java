package JavaMaster.Encapsulation.Printer;

public class Main {
    public static void main(String[] args) {


PagePrinter pagePrinter= new PagePrinter();
pagePrinter.tonerCheck();
pagePrinter.printPages(117);
pagePrinter.tonerCheck();
pagePrinter.tonerFiller();
        pagePrinter.tonerCheck();
    }
}
