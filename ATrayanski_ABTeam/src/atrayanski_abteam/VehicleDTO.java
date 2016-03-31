package atrayanski_abteam;

/**
 * Vehicle Data Transfer Object
 *
 * @author Aleksandar Trayanski
 */
public class VehicleDTO {

    private String sipp;
    private String name;
    private double price;
    private String supplier;
    private double rating;
    private CarTypeEnum carType;
    private DoorsCarTypeEnum doorsCarType;
    private TransmisionEnum transmision;
    private FuelACEnum fuel;
    private FuelACEnum ac;
    private int vehicleScore;
    private double sumScore;

    // Getters and Setters
    public CarTypeEnum getCarType() {
        return carType;
    }

    public void setCarType(CarTypeEnum carType) {
        this.carType = carType;
    }

    public DoorsCarTypeEnum getDoorsCarType() {
        return doorsCarType;
    }

    public void setDoorsCarType(DoorsCarTypeEnum doorsCarType) {
        this.doorsCarType = doorsCarType;
    }

    public TransmisionEnum getTransmision() {
        return transmision;
    }

    public void setTransmision(TransmisionEnum transmision) {
        this.transmision = transmision;
    }

    public FuelACEnum getFuel() {
        return fuel;
    }

    public void setFuel(FuelACEnum fuel) {
        this.fuel = fuel;
    }

    public FuelACEnum getAc() {
        return ac;
    }

    public void setAc(FuelACEnum ac) {
        this.ac = ac;
    }

    public String getSipp() {
        return sipp;
    }

    public void setSipp(String sipp) {
        this.sipp = sipp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getRating() {
        return rating;
    }

    public int getVehicleScore() {
        return vehicleScore;
    }

    public void setVehicleScore(int vehicleScore) {
        this.vehicleScore = vehicleScore;
    }

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Prints the calculated specifications
     * @param i Number of entry
     */
    public void printSpecs(int i) {
        try {
            System.out.println(i + ". " + name + " - " + sipp + " - " + carType + " - " + doorsCarType + " - " + transmision + " - " + fuel + " - " + ac);
        } catch (Exception e) {
            System.out.println("VehicleDTO printSpec error " + e.getMessage());
        }
    }

    /**
     * Prints the calculated scores
     * @param i Number of entry
     */
    public void printScore(int i) {
        try {
            System.out.println(i + ". " + name + " - " + vehicleScore + " - " + rating + " - " + sumScore);
        } catch (Exception e) {
            System.out.println("VehicleDTO printSpec error " + e.getMessage());
        }
    }

}
