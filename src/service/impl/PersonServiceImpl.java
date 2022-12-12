package service.impl;

import classes.Passport;
import enums.Gender;
import enums.Region;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonServiceImpl implements PersonService {

    private ArrayList<Passport> passportList = new ArrayList<>();

    @Override
    public ArrayList<Passport> getAllPassport() {
        return passportList;
    }

    @Override
    public ArrayList<Passport> getPassportFirstName() {
        System.out.println("Enter a first name: ");
        String firstName = new Scanner(System.in).nextLine();
        ArrayList<Passport> lists = new ArrayList<>();
        for (Passport passport : passportList) {
            if (passport.getFirstName().equals(firstName)) {
                lists.add(passport);
                return lists;
            }
        }
        return null;
    }

    @Override
    public List<Region> getAllCity() {
        return List.of(Region.values());
    }
    @Override
    public String сreatePassport(Passport passport) {
        try {
            System.out.println("REGISTER FOR A PASSPORT.");
            System.out.println("Fill out the questionnaire ");
            System.out.println("ID: ");
            long id = new Scanner(System.in).nextLong();
            System.out.println("Enter a last name");
            String lastName = new Scanner(System.in).nextLine();
            System.out.println("Enter a first name: ");
            String firstName = new Scanner(System.in).nextLine();
            System.out.println("Birthday (yyy-mm-dd): ");
            String[] birthDateList = new Scanner(System.in).nextLine().trim().split("-");
            System.out.println("Gender: ");
            String gender = new Scanner(System.in).nextLine();
            System.out.println("Region: ");
            String region = new Scanner(System.in).nextLine();

            LocalDate localDate = LocalDate.of(
                    Integer.parseInt(birthDateList[0]),
                    Integer.parseInt(birthDateList[1]),
                    Integer.parseInt(birthDateList[2]));


            Passport passport1 = new Passport(id, lastName, firstName, localDate, Gender.valueOf(gender), Region.valueOf(region));
            passportList.add(passport1);
        } catch (Exception e) {
            System.out.println("You are not registered.");
        }
        return "Successfully!";
    }
}