package ChainofResponsibility;

// Handler.java
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handle(Message message);

    public static class CompensationClaimHandler extends Handler {
        @Override
        public String handle(Message message) {
            if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
                return "Compensation Claim Handled: " + message.getContent() + " from " + message.getSenderEmail();
            } else if (successor != null) {
                return successor.handle(message);
            }
            return "No handler found for message: " + message.getContent();
        }
    }

    public static class ContactRequestHandler extends Handler {
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

    public static class DevelopmentSuggestionHandler extends Handler {
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

    public static class GeneralFeedbackHandler extends Handler {
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
}








