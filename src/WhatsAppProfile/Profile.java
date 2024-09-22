package src.WhatsAppProfile;

public class Profile{
    private String name;
    private String about;
    private String phoneNo;
    private String countryCode; // for ex. "+91"


    public Profile(String name , String about, String phoneNo , String countryCode){
        this.name = name;
        this.about =  about;
        this.countryCode = countryCode;
        if (phoneNo.length()==10)
        {
            this.phoneNo= phoneNo;
        }
        else {
            this.phoneNo="Inavlid";
        }
    }

    public String getName(){
        return this.name;
    }

    public String getAbout(){
        return this.about;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getCountryCode(){
        return this.countryCode;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setAbout(String a){
        this.about = a;
    }

    public void setCountryCode(String c){
        this.countryCode = c;
    }

    public void setPhoneNo(String p){
        if (phoneNo.length()==10)
        {
            this.phoneNo= p;
        }
        else {
            this.phoneNo="Inavlid";
        }

    }
}










//     private String name;
//     private String countryCode;
//     private String phoneNo;
//     private String about;

    
// public Profile(String name, String countryCode, String phoneNo, String about){
//     setName(name);
//     setPhoneNo(countryCode, phoneNo);
//     setAbout(about);
//     }

//     //in this the methods are set and get the attributes(setters and getters)
//     public void setName(String name){
//             this.name = name;
//     }

//     public void setPhoneNo(String countryCode, String phoneNo){
//             this.countryCode = countryCode;
//             this.phoneNo = phoneNo;
//     }

//     public void setAbout(String about){
//             this.about = about;
//     }

//     public String getName(){
//         return name;
//     }

//     public String getPhoneNo(){
//         return countryCode + " " + phoneNo;
//     }

//     public String getAbout(){
//         return about;
//     }
// }
