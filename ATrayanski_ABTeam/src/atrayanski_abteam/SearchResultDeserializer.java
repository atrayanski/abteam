package atrayanski_abteam;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * Search Result Deserializer 
 * @author Aleksandar Trayanski
 */
public class SearchResultDeserializer implements JsonDeserializer<SearchResultDTO>{

    @Override
    public SearchResultDTO deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        SearchDTO search = context.deserialize(jsonObject.get("Search"), SearchDTO.class);
        
        SearchResultDTO searchResult = new SearchResultDTO();
        searchResult.setSearch(search);
        return searchResult;
    }
    
}
