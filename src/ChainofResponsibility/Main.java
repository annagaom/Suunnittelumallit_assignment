package ChainofResponsibility;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create handler chain
        Handler.GeneralFeedbackHandler generalFeedbackHandler = new Handler.GeneralFeedbackHandler();
        Handler.DevelopmentSuggestionHandler developmentSuggestionHandler = new Handler.DevelopmentSuggestionHandler();
        developmentSuggestionHandler.setSuccessor(generalFeedbackHandler);
        Handler.ContactRequestHandler contactRequestHandler = new Handler.ContactRequestHandler();
        contactRequestHandler.setSuccessor(developmentSuggestionHandler);
        Handler.CompensationClaimHandler compensationClaimHandler = new Handler.CompensationClaimHandler();
        compensationClaimHandler.setSuccessor(contactRequestHandler);

        // Create various messages
        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "Request for refund due to service failure.", "customer1@example.com"),
                new Message(MessageType.CONTACT_REQUEST, "Please contact me regarding my recent purchase.", "customer2@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "I suggest adding more payment options.", "customer3@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "The service was excellent, thank you!", "customer4@example.com"),
        };
        // Process each message through the handler chain
        for (Message message : messages) {
            String result = compensationClaimHandler.handle(message);
            System.out.println(result);
        }
    }
}
