package atrayanski_abteam;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * 
 * @author Aleksandar Trayanski
 */
public class VehicleDeserializer implements JsonDeserializer<VehicleDTO>{

    @Override
    public VehicleDTO deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        VehicleDTO vehicle = new VehicleDTO();
        
        vehicle.setSipp(jsonObject.get("sipp").getAsString());
        vehicle.setName(jsonObject.get("name").getAsString());
        vehicle.setPrice(jsonObject.get("price").getAsDouble());
        vehicle.setSupplier(jsonObject.get("supplier").getAsString());
        vehicle.setRating(jsonObject.get("rating").getAsDouble());
        ProcessorFactory.process(vehicle);
        
        return vehicle;
    }
    
    
    
}
