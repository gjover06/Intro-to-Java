package chapter11.sectionfiveto14;

public class Person {

    String name;
    String address;
    String phone;
    String email;

    public Person(){
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
public void setEmail(String email){
        this.email = email;
}

//Return a string discription of the class
public String toString(){
        return "\nName: " + name + "\nAddress: "
                + address + "\nPhone: " + phone + "\nEmail: " + email;
}

}
