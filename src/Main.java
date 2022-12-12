import classes.Passport;

import classes.Profile;
import enums.Gender;
import enums.Region;
import service.impl.PersonServiceImpl;
import service.impl.WhatsAppServiceImpl;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scannerS = new Scanner(System.in);
    public static void main(String[] args) {


        PersonServiceImpl service = new PersonServiceImpl();

        Passport passport = new Passport();

        WhatsAppServiceImpl service1 = new WhatsAppServiceImpl();


        while (true){
            System.out.println("<<<<which methods you choose>>>>");
        System.out.println("""
                1 -> getAllPassport,
                2 -> getPassportByFirstName,
                3 -> getAllWhatsApp,
                4 -> goToProfile,
                5 -> getAllCity,
                6 -> getWhatsAppStatus,
                7 -> сreatePassport,
                8 -> installWhatsApp,
                9 -> changeStatus,
                10 -> addContact,
                11 -> sendMessage,
                12 -> seeStatus,
                """);

            int number = scannerS.nextInt();
            switch (number) {
                case 1 -> System.out.println(service.getAllPassport());
                case 2 -> System.out.println(service.getPassportFirstName());
                case 3 -> System.out.println(service1.getAllWhatsApp());
                case 4 -> System.out.println(service1.goToYourProfile());
                case 5 -> System.out.println(service.getAllCity());
                case 6 -> System.out.println(service1.getWhatsAppStatus());
                case 7 -> System.out.println(service.сreatePassport(passport));
                case 8 -> System.out.println(service1.installWhatsApp());
                case 9 -> System.out.println(service1.changeStatus());
                case 10 -> System.out.println(service1.addContact());
                case 11 -> System.out.println(service1.sendMessage());
                case 12 -> System.out.println(service1.seeStatus());
            }
        }



    }
}