package atrayanski_abteam;

/**
 * Transmision type ENUM
 * @author Aleksandar Trayanski
 */
public enum TransmisionEnum {
    MANUAL("Manual"), 
    AUTOMATIC("Automatic");

    private String value;

    private TransmisionEnum(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value != null ? value : "empty";
    }
}
