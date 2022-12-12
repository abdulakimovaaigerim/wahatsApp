package classes;

import enums.Gender;
import enums.Region;

import java.time.LocalDate;
public class Passport {
    private long ID;
    private String lastName;
    private String firstName;
    private LocalDate birthDay;
    private Gender gender;
    private Region region;

    public Passport(long ID, String lastName, String firstName, LocalDate birthDay, Gender gender, Region region) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.region = region;
    }
    public Passport(){

    }

    public long getID() {
        return ID;
    }

    public void setIdD(long ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Passport" +
                "\nid: " + ID +
                "\nlastName: " + lastName +
                "\nfirstName: " + firstName +
                "\nbirthDay: " + birthDay +
                "\ngender: " + gender +
                "\nregion: " + region ;
    }
}

