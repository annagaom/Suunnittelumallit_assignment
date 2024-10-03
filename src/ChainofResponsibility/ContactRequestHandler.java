package ChainofResponsibility;

public class ContactRequestHandler extends Handler {
    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            return "Contact Request Forwarded: " + message.getContent() + " from " + message.getSenderEmail();
        } else if (successor != null) {
            return successor.handle(message);
        }
        return "No handler found for message: " + message.getContent();
    }
}