package src.Messages.MessageType;

public class TextMessage extends Message{

    public TextMessage(String sender, String recipient, String content, boolean isRead){
        super(sender,recipient,content);
        this.isRead = isRead;
        //it same as that Message(sender,recipient,content);
    }

    private boolean isRead;
    private String sender;

    public boolean isRead(){
        return isRead;
    }
    
    public void setIsRead(boolean isRead){
        this.isRead = isRead;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getContent(){
        String readRecipient = super.getContent();
        if(isRead)
        {
            readRecipient +="(read)";
        }
        return readRecipient;
    }

    }
    /*other setters and getters *//*other functions */
