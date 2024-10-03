package ChainofResponsibility;

public class CompensationClaimHandler extends Handler {
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
