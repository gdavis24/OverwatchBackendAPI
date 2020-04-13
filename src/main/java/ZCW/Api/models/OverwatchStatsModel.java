package ZCW.Api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OverwatchStatsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private int level;
    private String portrait;

    public OverwatchStatsModel(String username, int level, String portrait){
        this.username = username;
        this.level = level;
        this.portrait = portrait;
    }

    public OverwatchStatsModel(){}

    public String getUsername(){
        return username;
    }

    public int getLevel(){
        return level;
    }

    public String getPortrait(){
        return portrait;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
