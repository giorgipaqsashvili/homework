public abstract class Notification {
    protected String sender;
    protected String recipient;
    protected String messageText;

    public Notification(String sender, String recipient, String messageText) {
        this.sender = sender;
        this.recipient = recipient;
        this.messageText = messageText;
    }

    public abstract void send();
    public abstract void receive();
}


