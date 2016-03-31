package atrayanski_abteam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 * Main Class
 *
 * @author Aleksandar Trayanski
 */
public class Main {

    private static final String URL = "http://www.rentalcars.com/js/vehicles.json";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();

            //Regestering custom Deserializers
            gsonBuilder.registerTypeAdapter(SearchResultDTO.class, new SearchResultDeserializer());
            gsonBuilder.registerTypeAdapter(SearchDTO.class, new SearchDeserializer());
            gsonBuilder.registerTypeAdapter(VehicleDTO.class, new VehicleDeserializer());
            Gson gson = gsonBuilder.create();

            String json = IOUtils.toString(new URL(URL));
            //Initiate the parsing
            SearchResultDTO searchResult = gson.fromJson(json, SearchResultDTO.class);
            //Printing the results
            printFormatedSpecs(searchResult.getSearch());
            printFormatedScore(searchResult.getSearch());

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void printFormatedSpecs(SearchDTO search) {
        //used for incrementing integer
        AtomicInteger i = new AtomicInteger(1);
        System.out.println("-----------------Task 1 ------------------");
        //For each printout of the Vehicles
        Arrays.asList(search.getVehicleList())
                .forEach(p -> p.printSpecs(i.getAndIncrement()));
        System.out.println("-----------------End Task 1 --------------");

    }

    private static void printFormatedScore(SearchDTO search) {
        //used for incrementing integer
        AtomicInteger i = new AtomicInteger(1); 
        System.out.println("-----------------Task 2 ------------------");
        Arrays.asList(search.getVehicleList())
                .stream()
                .sorted((v1, v2) -> Double.compare(v2.getSumScore(), v1.getSumScore()))//Sort the entries in Desc order
                .forEach(p -> p.printScore(i.getAndIncrement()));//For each printout of the sorted vehicles
        System.out.println("-----------------End Task 2 --------------");
    }

}
