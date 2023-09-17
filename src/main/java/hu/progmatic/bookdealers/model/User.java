package hu.progmatic.bookdealers.model;

public class User {
    private int id;
    String name;
    private int  birthdate;
    private int regDate;


    public User(){

    }


    public User(int id, String name, int birthdate, int regDate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public int getRegDate() {
        return regDate;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
