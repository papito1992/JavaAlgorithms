package JavaMaster.Encapsulation.Printer;

public class Printer {
  private   int pagesPrinted;
//  private PagePrinter pagePrinter;

  public PagePrinter pagePrinter;
   private boolean isDuplex;



    public Printer(int i, int printPages, boolean b) {
    }






    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }


    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }
}
