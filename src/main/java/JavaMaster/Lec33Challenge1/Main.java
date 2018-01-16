package JavaMaster.Lec33Challenge1;

public class Main {
    public static void main(String[] args) {
//        BankAccDetails bankAccDetails= new BankAccDetails();
//        bankAccDetails.withdrawFunds(499);
//        bankAccDetails.setBallance(500);
////        bankAccDetails.addFunds(500);
//        bankAccDetails.getBallance();
//
//        bankAccDetails.withdrawFunds(499);
//
//        bankAccDetails.getBallance();
        VipAcc vipAcc= new VipAcc();
        vipAcc.getName();
        vipAcc.getEmail();
        vipAcc.getCredit_limit();
        VipAcc vipAc1c= new VipAcc("paul@paul.com", "paul");
        vipAcc.getName();
        vipAcc.getEmail();
        vipAcc.getCredit_limit();
        VipAcc vipAc2c= new VipAcc("hjbhb","hbhbh",66666);
        vipAcc.getName();
        vipAcc.getEmail();
        vipAcc.getCredit_limit();

    }
}
