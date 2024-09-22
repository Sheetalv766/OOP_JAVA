package src.Messages.MessageType;

public class AudioMessage extends Message{
    private int duration;
    public AudioMessage(String sender, String recipient, String content , int duration){
        super(sender,recipient,content);
        this.duration = duration;
        //it same as that Message(sender,recipient,content);
    }

    public AudioMessage(String sender, String recipient, String content) {
        this(sender, recipient, content, 0);  
        // The new constructor is internally calling the other constructor but with 0 as value for duration. It uses this keyword to achieve this.
    }
    
    public void setDuration(int duration) {
        this.duration = duration;  // This converts String to int
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(String durationInSeconds) {
        this.duration = Integer.parseInt(durationInSeconds);
    }

        
    /*other setters and getters */
    /*other methods */
}
