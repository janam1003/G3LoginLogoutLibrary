package Classes;

import java.io.Serializable;

/**
 * Class 'Message' which implements the 'Serializable' interface.
 *
 * @author Janam
 */
public class Message implements Serializable {

    private User user;
    private MessageType Type;

    public Message() {
    }

    public Message(User user, MessageType Type) {
        this.user = user;
        this.Type = Type;
    }

    // Getter and Setter 
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageType getType() {
        return Type;
    }

    public void setType(MessageType Type) {
        this.Type = Type;
    }

}
