package src.Messages.MessageType;
public class EmailMessage extends Message{

    public EmailMessage(String sender, String recipient, String content, String subject){
        super(sender,recipient,content);
    }

    private String subject;

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public String getContent(){
        String contentSubject = "Subject : " + subject + "\n\n" +super.getContent();
        return contentSubject;
    }
        
        /*setters and getters */
    /*other functions */
}
