package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.List;
public class Profile  {
    private long ID;
    private String userName;
    private String password;
    private String phoneNumber;
    private List<Profile> contact;
    private List<String> message = new ArrayList<>();
    private Status status;

    public Profile(long ID, String userName, String password, String phoneNumber, List<Profile> contact, List<String> message, Status status) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.contact = contact;
        this.message = message;
        this.status = status;
    }
    public Profile(){

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Profile> getContact() {
        return contact;
    }

    public void setContact(List<Profile> contact) {
        this.contact = contact;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Profile: " +
                "\nid: " + ID +
                "\nuserName: " + userName +
                "\npassword: " + password +
                "\nphoneNumber: " + phoneNumber +
                "\ncontact: " + contact +
                "\nmessage: " + message +
                "\nstatus: " + status ;
    }
}
