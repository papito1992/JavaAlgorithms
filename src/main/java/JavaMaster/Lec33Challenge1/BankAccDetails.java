package JavaMaster.Lec33Challenge1;

public class BankAccDetails {
    private int number, ballance, phone_number;
    private String email, name;

    public BankAccDetails() {
    }

    public int  withdrawFunds(int withdraw){
        if (ballance-withdraw>=0){
            this.ballance-=withdraw;
            return ballance;}
           else {
            System.out.println("Cant withdraw more than u have! \n Your current ballance is :   " +ballance +"\n"
                    +" and you are trying to withdraw : " +withdraw  );
        }
        return ballance;

    }
    public int addFunds(int addFunds){
        this.ballance+=addFunds;
        System.out.println("This is how much u have " +ballance);
        return ballance;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBallance() {
        System.out.println("This is how much u have " +ballance);
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
