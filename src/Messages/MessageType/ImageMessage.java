package src.Messages.MessageType;
public class ImageMessage extends Message{
   
    public ImageMessage(String sender, String recipient, String content, String imageUrl){
        super(sender,recipient,content);
    }

    private String imageUrl;

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
        
    /*other setters and getters */
    /*other functions */
}
