package chapter11.sectionfiveto14;

public class Faculty extends Person {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address,
                   String phone, String email, int status){
        super(name, address, phone, email);
        this.officeHours = officeHours;
        this.rank = rank;

    }



    //return office hours
    public String getOfficeHours(){
        return officeHours;
    }

    //
    public void setOfficeHours (String officeHours){
        this.officeHours = officeHours;
    }

    public String getRank(){
        return rank;
    }

    public void setRank (String rank){
        this.rank = rank;
    }

    public String toString(){
        return super.toString() + "\nOffice Hours: "
                + officeHours + "\nRank: " + rank;
    }
}
