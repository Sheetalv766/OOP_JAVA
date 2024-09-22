package src.WhatsAppProfile.Solution;

public class Profile{
    private String name;
    private String countryCode;
    private String phoneNo;
    private String about;

    public void setName(String name){
        if(name.isBlank()){
            System.out.println("Error: name cannot be blank!");
        }else{
            this.name = name;
        }
    }

    public void setPhoneNo(String countryCode, String phoneNo){
        if(phoneNo.length()!=10){
            System.out.println("Error: phoneNo must be 10 digits only");
        }else{
            this.countryCode = countryCode;
            this.phoneNo = phoneNo;
        }
    }

    public void setAbout(String about){
        if(about.isBlank()){
            System.out.println("Error: about cannot be blank");
        }else{
            this.about = about;
        }
    }

    public String getName(){
        return name;
    }

    public String getPhoneNo(){
        return countryCode + " " + phoneNo;
    }

    public String getAbout(){
        return about;
    }

    public Profile(String name, String countryCode, String phoneNo, String about){
        setName(name);
        setPhoneNo(countryCode, phoneNo);
        setAbout(about);
    }
}
