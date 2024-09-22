package src.Messages;

import src.Messages.MessageType.AudioMessage;
import src.Messages.MessageType.EmailMessage;
import src.Messages.MessageType.ImageMessage;
import src.Messages.MessageType.TextMessage;

public class Main {
    public static void main(String[] args){
    AudioMessage msg3 = new AudioMessage("Arya", "Sansa", "Hi sister!",5);
    msg3.setDuration(9);               //line 1
    System.out.println("Duration: " + msg3.getDuration());
    msg3.setDuration("20");          //line 2
    System.out.println("Duration: " + msg3.getDuration());

        
    //     AudioMessage msg3 = new AudioMessage("Arya", "Sansa", "Hi sister!",5);
    //     System.out.println("Content of msg sent by " + msg3.getSender() + " : " + msg3.getContent());
    //     EmailMessage msg4 = new EmailMessage("Sansa", "Arya", "Bye sister!!", "Greetings");
    //     System.out.println("Content of msg sent by " + msg4.getSender() + " : " + msg4.getContent());
    // }
    }
}
