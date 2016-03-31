package atrayanski_abteam;

/**
 * Fuel/AC ENUM
 * @author Aleksandar Trayanski
 */
public enum FuelACEnum {
    PETROL("Petrol"), 
    AC("AC"),
    NOAC("no AC");

    private String value;

    private FuelACEnum(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value != null ? value : "empty";
    }
}
