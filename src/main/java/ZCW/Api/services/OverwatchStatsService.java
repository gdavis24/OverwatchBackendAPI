package ZCW.Api.services;

import ZCW.Api.models.OverwatchStatsModel;
import ZCW.Api.repositories.OverwatchStatsRepo;
import kong.unirest.HttpResponse;
import kong.unirest.JsonObjectMapper;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class OverwatchStatsService {

    private final OverwatchStatsRepo repo;

    @Autowired
    public OverwatchStatsService(OverwatchStatsRepo repos){
        repo = repos;
    }

    public OverwatchStatsModel findById(String battleNetUsername){
        return saveToDatabaseAndReturn(battleNetUsername);
    }

    public OverwatchStatsModel save(OverwatchStatsModel changeLater){
        repo.save(changeLater);
        return changeLater;
    }

    //turns fetchedAPIQuery into the actual object
    public OverwatchStatsModel makeObject(String json){
        JsonObjectMapper mapper = new JsonObjectMapper();
        OverwatchStatsModel PWLObj = mapper.readValue(json, OverwatchStatsModel.class);

        return PWLObj;
    }

    //used to send API request  https://api.opendota.com/api/players/48587327/wl <-- this one is for getting the win loss
    public static String fetchApiQuery(String yourQuery){
        HttpResponse<String> response = Unirest.get(yourQuery).asString();
        return response.getBody();
    }

    public OverwatchStatsModel saveToDatabaseAndReturn(String battleNetUsername){
        String jsonOfWL = fetchApiQuery("http://owapi.io/profile/pc/us/" + battleNetUsername);
        OverwatchStatsModel PWLObj = makeObject(jsonOfWL);
        PWLObj.setUsername(battleNetUsername);
        return  save(PWLObj);
    }

}
