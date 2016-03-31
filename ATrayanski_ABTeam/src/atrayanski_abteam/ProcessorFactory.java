package atrayanski_abteam;

/**
 * Processor class for the SIPP and vehicle scoring
 * @author Aleksandar Trayanski
 */
public class ProcessorFactory {

    //The Vihecle object to be processed
    private static VehicleDTO vdto;
    
    public static void process(VehicleDTO vdto){
        processSIPP(vdto);
        processScore(vdto);
    }
    
    /**
     * Process score
     * @param vdto VehicleDTO to be processed
     */
    private static void processScore(VehicleDTO vdto){
        int score = 0;
        switch(vdto.getTransmision()){
            case MANUAL:
                score += 1;
                break;
            case AUTOMATIC:
                score += 5; 
                break;
            default:
                break;
        }
        
        switch(vdto.getAc()){
            case AC:
                score += 2;
                break;
            default:
                break;
        }
        vdto.setVehicleScore(score);
        vdto.setSumScore(new Integer(score).doubleValue() + vdto.getRating());
    }

    /**
     * Processes SIPP
     * @param vdto VehicleDTO to be processed
     */
    private static void processSIPP(VehicleDTO vdto) {
        ProcessorFactory.vdto = vdto;
        String sipp = vdto.getSipp();
        if (sipp != null) {
            //Iterating the chars of the SIPP
            for (int i = 0; i < sipp.length(); i++) {
                switch (i) {
                    case 0:
                        getCarTypeSIPP(sipp.charAt(i));
                        break;
                    case 1:
                        getDoorsTypeSIPP(sipp.charAt(i));
                        break;
                    case 2:
                        getTransmissionSIPP(sipp.charAt(i));
                        break;
                    case 3:
                        getFuelAirConSIPP(sipp.charAt(i));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /**
     * Processes Car Type SIPP
     * @param c First Char
     */
    private static void getCarTypeSIPP(char c) {
        switch (c) {
            case 'M':
                vdto.setCarType(CarTypeEnum.MINI);
                break;
            case 'E':
                vdto.setCarType(CarTypeEnum.ECONOMY);
                break;
            case 'C':
                vdto.setCarType(CarTypeEnum.COMPACT);
                break;
            case 'I':
                vdto.setCarType(CarTypeEnum.INTERMEDIATE);
                break;
            case 'S':
                vdto.setCarType(CarTypeEnum.STANDARD);
                break;
            case 'F':
                vdto.setCarType(CarTypeEnum.FULLSIZE);
                break;
            case 'P':
                vdto.setCarType(CarTypeEnum.PREMIUM);
                break;
            case 'L':
                vdto.setCarType(CarTypeEnum.LUXURY);
                break;
            case 'X':
                vdto.setCarType(CarTypeEnum.SPECIAL);
                break;
            default:
                break;
        }
    }

    /**
     * Processes Doors/Car Type 
     * @param c Second Char
     */
    private static void getDoorsTypeSIPP(char c) {
        switch (c) {
            case 'B':
                vdto.setDoorsCarType(DoorsCarTypeEnum.DOORS2);
                break;
            case 'C':
                vdto.setDoorsCarType(DoorsCarTypeEnum.DOORS4);
                break;
            case 'D':
                vdto.setDoorsCarType(DoorsCarTypeEnum.DOORS5);
                break;
            case 'W':
                vdto.setDoorsCarType(DoorsCarTypeEnum.ESTATE);
                break;
            case 'T':
                vdto.setDoorsCarType(DoorsCarTypeEnum.CONVERTABLE);
                break;
            case 'F':
                vdto.setDoorsCarType(DoorsCarTypeEnum.SUV);
                break;
            case 'P':
                vdto.setDoorsCarType(DoorsCarTypeEnum.PICKUP);
                break;
            case 'V':
                vdto.setDoorsCarType(DoorsCarTypeEnum.PVAN);
                break;
            default:
                break;
        }
    }

    /**
     * Processes Transmission type
     * @param c Third Char
     */
    private static void getTransmissionSIPP(char c) {
        String result;
        switch (c) {
            case 'M':
                vdto.setTransmision(TransmisionEnum.MANUAL);
                break;
            case 'A':
                vdto.setTransmision(TransmisionEnum.AUTOMATIC);
                break;
            default:
                break;
        }
    }

    /**
     * Processes Fuel and AC Type
     * @param c Fourth Char
     */
    private static void getFuelAirConSIPP(char c) {
        switch (c) {
            case 'N':
                vdto.setFuel(FuelACEnum.PETROL);
                vdto.setAc(FuelACEnum.NOAC);
                break;
            case 'R':
                vdto.setFuel(FuelACEnum.PETROL);
                vdto.setAc(FuelACEnum.AC);
                break;
            default:
                break;
        }
    }
}
