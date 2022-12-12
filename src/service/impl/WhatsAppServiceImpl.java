package service.impl;
import classes.Passport;
import classes.Profile;
import enums.Status;
import service.WhatsAppService;

import javax.sql.rowset.serial.SerialStruct;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WhatsAppServiceImpl implements WhatsAppService {

    private List<Profile> profiles = new ArrayList<>();

    @Override
    public List<Profile> getAllWhatsApp() {
        return profiles;
    }

    @Override
    public Profile goToYourProfile() {
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if(profile.getPassword().equals(password)){
                return profile;
            }
        }
        return null;
    }

    @Override
    public List<Status> getWhatsAppStatus() {
        return List.of(Status.values());

    }

    @Override
    public String installWhatsApp() {
        try {
            System.out.println("id: ");
            long id = new Scanner(System.in).nextLong();
            System.out.println("userName: ");
            String userName = new Scanner(System.in).nextLine().trim();
            System.out.println("password: ");
            String password = new Scanner(System.in).nextLine();
            System.out.println("phoneNumber: : ");
            String phoneNumber = new Scanner(System.in).nextLine().toLowerCase();

            ArrayList<Profile> contacts = new ArrayList<>();
            ArrayList<String> message = new ArrayList<>();


            for (Profile profile : profiles) {
                if(profile.getUserName().equals(userName)){
                    throw new Exception("Your userName is incorrect!");
                }
                if (profile.getID()==id){
                    throw new Exception("Your id is incorrect!");
                }
                if(profile.getPassword().equals(password)){
                    throw new Exception("Your password is incorrect!");
                }
                if(profile.getPhoneNumber().equals(phoneNumber)){
                    throw new Exception("Your phoneNumber is incorrect!");
                }
            }
            Profile profile = new Profile(id,userName,password,phoneNumber,contacts,message,Status.AT_WORK);
            profiles.add(profile);

        }catch (Exception e){
            e.printStackTrace();

       }
        return "Successfully WhatsApp!";
   }

    @Override
    public String changeStatus() {
        try {
            System.out.println("Enter your userName: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Enter your password: ");
            String password = new Scanner(System.in).nextLine();

            for (Profile profile : profiles) {
                if(profile.getUserName().equals(userName) && profile.getPassword().equals(password)){
                    System.out.println("STATUS LIST: "+ Arrays.toString(Status.values()));
                    System.out.println("Enter your status: ");
                    String statuss = new Scanner(System.in).nextLine();
                    profile.setStatus(Status.valueOf(statuss.toUpperCase()));
                    System.out.println(profile.getStatus());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return "Your status has been set!";
    }

    @Override
    public String addContact() {
        System.out.println("Enter your userName: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();

        for (Profile profile : profiles) {
            if(profile.getUserName().equals(userName) && profile.getPassword().equals(password)){
                System.out.println("Enter a phoneNumber: ");
                String phoneNumber = new Scanner(System.in).nextLine();
                System.out.println("Enter a contact userName: ");
                String contactUserName = new Scanner(System.in).nextLine();


                for (Profile profile1 : profiles) {
                    if(profile1.getUserName().equals(contactUserName) && profile1.getPhoneNumber().equals(phoneNumber)){
                        List<Profile> contacts = new ArrayList<>();
                        contacts.add(profile1);
                        profile.setContact(contacts);
                    }
                }
            }
        }
      return "contact added!";
    }

    @Override
    public String sendMessage() {
        try {
            System.out.println("Enter your userName: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Enter your password: ");
            String password = new Scanner(System.in).nextLine();

            for (Profile profile : profiles) {
                if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)) {
                    System.out.println("Write message: ");
                    while (true){
                        String message = new Scanner(System.in).nextLine();
                        System.out.println("Will send a message? YES/NO");
                        return "MESSAGE SENT!";
                    }

                }

            }
        }catch (Exception e){
            System.out.println("MESSAGE FAILED TO BE SENT!");
        }
        return null;
    }

    @Override
    public List<Status> seeStatus() {
        return List.of(Status.values());


    }
}
