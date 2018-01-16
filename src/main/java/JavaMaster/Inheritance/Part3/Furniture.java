package JavaMaster.Inheritance.Part3;

public class Furniture {
    private int chairq, table, bedq;


    public Furniture() {
        this(0,0,0);
        System.out.println("shit" +chairq +"shit1"+table +"shit2"+bedq);
    }

    public Furniture(int chairq) {
        this.chairq = chairq;
        this.bedq=0;this.table=0;
        System.out.println("shit" +chairq +"shit1"+table +"shit2"+bedq);

    }

    public Furniture(int chairq, int table) {
        this.chairq = chairq;
        this.table = table;
        this.bedq=0;
        System.out.println("shit" +chairq +"shit1"+table +"shit2"+bedq);

    }


    public Furniture(int chairq, int table, int bedq) {
        this.chairq = chairq;
        this.table = table;
        this.bedq = bedq;
        System.out.println("shit" +chairq +"shit1"+table +"shit2"+bedq);

    }


        public int addTable(int add){
            System.out.println("how many tables u want to add");
          table=add;
            System.out.println("you have added " +add);
            return table;
        }



        public void addTChair(int add){
            System.out.println("how many chairs u want to add");
            this.chairq+=add;
            System.out.printf("you have added " +chairq);
//            return this.chairq;
        }



        public int addBed(int add){
            System.out.println("how many chairs u want to add");
            bedq=add;
            System.out.println("you have added " +add);
            return bedq;
        }


}
