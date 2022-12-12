package service;

import classes.Profile;
import enums.Status;

import java.util.List;

public interface WhatsAppService {
    List<Profile> getAllWhatsApp();
    Profile goToYourProfile();
    List<Status> getWhatsAppStatus();
    String installWhatsApp();
    String changeStatus();
    String addContact();
    String sendMessage();
    List<Status> seeStatus();

}
