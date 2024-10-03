package ChainofResponsibility;

// MessageType.java
public enum MessageType {
    COMPENSATION_CLAIM("Compensation Claim"),
    CONTACT_REQUEST("Contact Request"),
    DEVELOPMENT_SUGGESTION("Development Suggestion"),
    GENERAL_FEEDBACK("General Feedback");

    private final String type;

    MessageType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}


