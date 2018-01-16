package JavaMaster.Arrays.ChallengeWithArrays;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name, phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
public static Contact createContact(String name, String phone){
        return new Contact(name,phone);
}

}
