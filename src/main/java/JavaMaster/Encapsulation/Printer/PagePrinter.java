package JavaMaster.Encapsulation.Printer;

public class PagePrinter {
private int tonerLevel=100;
    public PagePrinter() {
    }

    public int printPages(int pagesToPrint) {

        for (int i = pagesToPrint; i > 0; i--) {
//         tonerLevel-=5;
            System.out.println("Hentai printed");
            if ((tonerLevel-=5)<=0){
                System.out.println("not enough toner to print this page, fill it UP");
                break;
            }}

    return tonerLevel;}


    public void tonerCheck(){
            System.out.println("Current fullness of toner : " +this.tonerLevel);
        }


    public int tonerFiller(){

            if (tonerLevel<100 && tonerLevel>=0){
                while (tonerLevel!=100)
                    this.tonerLevel++;
            }
            return this.tonerLevel;
        }

    }
//
//    public void print(int pagesToPrint){
//        this.pagesPrinted=pagesToPrint;
//        while (this.tonerLevel-(pagesToPrint*5)>0){
//            this.tonerLevel-=(pagesToPrint*5);
//            System.out.println("page printed");}
//
//



