package atrayanski_abteam;

/**
 * Car Type Enum
 * @author Aleksandar Trayanski
 */
public enum CarTypeEnum {
    MINI("Mini"),
    ECONOMY("Economy"),
    COMPACT("Compact"),
    INTERMEDIATE("Intermediate"),
    STANDARD("Standard"),
    FULLSIZE("Full size"),
    PREMIUM("Premium"),
    LUXURY("Luxury"),
    SPECIAL("Special");

    private String value;

    private CarTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value != null ? value : "empty";
    }
    
    
}
