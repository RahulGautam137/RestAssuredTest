package entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CricketTeam {

        @JsonProperty("name")
        private String name;
        @JsonProperty("location")
        private String location;
        @JsonProperty("player")
        private List<Player> player;

        @JsonProperty("name")
        public String getName() {
        return name;
    }

        @JsonProperty("name")
        public void setName(String name) {
        this.name = name;
    }

        @JsonProperty("location")
        public String getLocation() {
        return location;
    }

        @JsonProperty("location")
        public void setLocation(String location) {
        this.location = location;
    }

        @JsonProperty("player")
        public List<Player> getPlayer() {
        return player;
    }

        @JsonProperty("player")
        public void setPlayer(List<Player> player) {
        this.player = player;
    }

}
