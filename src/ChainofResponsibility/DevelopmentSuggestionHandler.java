package ChainofResponsibility;

public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            return "Development Suggestion Logged: " + message.getContent() + " from " + message.getSenderEmail();
        } else if (successor != null) {
            return successor.handle(message);
        }
        return "No handler found for message: " + message.getContent();
    }
}
