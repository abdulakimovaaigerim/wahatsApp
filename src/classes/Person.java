package classes;

import enums.Gender;
import enums.Region;

import java.time.LocalDate;

public class Person extends Passport {
    public Person(long ID, String lastName, String firstName, LocalDate birthDay, Gender gender, Region region) {
        super(ID, lastName, firstName, birthDay, gender, region);
    }
    public Person(){

    }
}
