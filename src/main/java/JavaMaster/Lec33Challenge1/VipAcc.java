package JavaMaster.Lec33Challenge1;

public class VipAcc {
    String email, name;
    double credit_limit;

    public VipAcc() {
    this(
            "Default Email", "John Doe", 0.69);
    }

    public VipAcc(String email, String name) {

        this(name, email, 999999);
    }

    public VipAcc(String email, String name, double credit_limit) {
        this.email = email;
        this.name = name;
        this.credit_limit = credit_limit;
        System.out.println(credit_limit+" "+email +" "+ name);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }
}
