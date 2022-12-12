package service;

import classes.Passport;
import enums.Region;

import java.util.ArrayList;

import java.util.List;

public interface PersonService {
    ArrayList<Passport> getAllPassport();
    ArrayList<Passport> getPassportFirstName();
    List<Region> getAllCity();
    String сreatePassport(Passport passport);

}
