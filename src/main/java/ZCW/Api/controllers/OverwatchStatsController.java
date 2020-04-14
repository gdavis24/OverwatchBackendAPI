package ZCW.Api.controllers;

import ZCW.Api.services.OverwatchStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverwatchStatsController {

    private static OverwatchStatsService serv;

    @Autowired
    public OverwatchStatsController(OverwatchStatsService ser){
        serv = ser;
    }

    @GetMapping("/OverwatchStats/{username}")
    public static ResponseEntity<?> getOverwatchStatsModel(@PathVariable String username){
        return new ResponseEntity<>(serv.findById(username), HttpStatus.CREATED);
    }

}
