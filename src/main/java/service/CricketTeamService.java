package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.CricketTeam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CricketTeamService {

    private File jsonFile = null;

    public CricketTeamService() {
        try {

            jsonFile = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\TeamRCB.json");
        } catch (Exception fn) {
            fn.printStackTrace();
        }
    }

    public CricketTeam convertJsonToCricketObject() {
        CricketTeam cricketTeam=null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            cricketTeam= mapper.readValue(jsonFile, CricketTeam.class);


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return cricketTeam;

    }
}
