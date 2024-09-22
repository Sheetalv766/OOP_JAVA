package src.Messages.MessageType;

public class Message {
    private String sender;
    private String recipient;
    private String content;

    public Message(String sender, String recipient, String content)
    {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }
    
    public String getSender(){
        return sender;
    }

    public String getRecipient(){
        return recipient;
    }
     
    public String getContent(){
        return content;
    }
    
}
