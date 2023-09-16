package hu.progmatic.bookdealers.model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class User {
    String name;
    private int  birthdate;
    private int regDate;


    public User() {

    }

    public User(String name, int birthdate, int regDate) {
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


    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public void setRegDate(int regDate) {
        this.regDate = regDate;
    }
}
