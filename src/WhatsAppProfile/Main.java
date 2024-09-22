package src.WhatsAppProfile;

public class Main{
    public static void main(String[] args){
        Profile profile1 = new Profile("Pam", "+44", "1589989870", "");
    
        System.out.println("Name: " + profile1.getName());
        System.out.println("Phone No.: " + profile1.getPhoneNo());
        System.out.println("About: " + profile1.getAbout());
    }
}
