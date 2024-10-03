package ChainofResponsibility;

// GeneralFeedbackHandler.java
public class GeneralFeedbackHandler extends Handler {
    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            return "General Feedback Analyzed: " + message.getContent() + " from " + message.getSenderEmail();
        } else if (successor != null) {
            return successor.handle(message);
        }
        return "No handler found for message: " + message.getContent();
    }
}
