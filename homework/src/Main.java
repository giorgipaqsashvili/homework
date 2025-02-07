public class Main {
    public static void main(String[] args) {
        Notification smsNotification = new Notification("John", "Alice", "Hello, this is a test message.") {
            @Override
            public void send() {
                System.out.println("Sending SMS from " + sender + " to " + recipient + ": " + messageText);
            }

            @Override
            public void receive() {
                System.out.println("Receiving SMS from " + sender + " to " + recipient + ": " + messageText);
            }
        };
        smsNotification.send();
        smsNotification.receive();
    }
}