import entities.CricketTeam;
import entities.Player;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import org.testng.asserts.SoftAssert;
import service.CricketTeamService;

import java.util.List;

public class TestCases {

    //SoftAssert softAssert=new SoftAssert();
    @Test
    public void TestCase_01(){
        CricketTeamService cricketTeamService=new CricketTeamService();
        CricketTeam cTeam=cricketTeamService.convertJsonToCricketObject();
        List<Player> playerList=cTeam.getPlayer();
        int countOfForeignPlayer=0;

        for (Player p: playerList) {
            if(!p.getCountry().equals("India")){
                countOfForeignPlayer++;
            }
        }
        String teamStatus="Team is Valid";
        if(countOfForeignPlayer>4){
            teamStatus="team is not valid";
        }


        Assert.assertEquals(teamStatus,"Team is Valid");

    }

    @Test
    public void TestCase_02(){

        CricketTeamService cricketTeamService=new CricketTeamService();
        CricketTeam cTeam=cricketTeamService.convertJsonToCricketObject();
        List<Player> playerList=cTeam.getPlayer();
        int countOfWicketKeeper=0;

        for (Player p: playerList) {
            if(!p.getRole().equals("Wicket-keeper")){
                countOfWicketKeeper++;
            }
        }
        String teamStatus="Team is Not Valid";
        if(countOfWicketKeeper>0){
            teamStatus="Team is Valid";
        }


        Assert.assertEquals(teamStatus,"Team is Valid");



    }
}
