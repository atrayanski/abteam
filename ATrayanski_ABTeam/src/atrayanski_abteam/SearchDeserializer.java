package atrayanski_abteam;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * Search Deserializer
 * @author Aleksandar Trayanski
 */
public class SearchDeserializer implements JsonDeserializer<SearchDTO>{

    @Override
    public SearchDTO deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        VehicleDTO[] vehicleList = context.deserialize(jsonObject.get("VehicleList"), VehicleDTO[].class);
        
        SearchDTO search = new SearchDTO();
        search.setVehicleList(vehicleList);
        return search;
    }
    
}
