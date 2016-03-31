package atrayanski_abteam;

/**
 * Doors/Car Type Enum
 * @author Aleksandar Trayanski
 */
public enum DoorsCarTypeEnum {
    DOORS2("2 doors"),
    DOORS4("4 doors"),
    DOORS5("5 doors"),
    ESTATE("Estate"),
    CONVERTABLE("Convertible"),
    SUV("SUV"),
    PICKUP("Pick up"),
    PVAN("Passenger Van");

    private String value;

    private DoorsCarTypeEnum(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
       return value != null ? value : "empty";
    }
}
