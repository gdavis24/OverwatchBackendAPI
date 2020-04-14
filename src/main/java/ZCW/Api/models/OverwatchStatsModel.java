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
    private String levelFrame;
    private String star;

    public OverwatchStatsModel(String username, int level, String portrait, String levelFrame, String star){
        this.username = username;
        this.level = level;
        this.portrait = portrait;
        this.levelFrame = levelFrame;
        this.star = star;
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

    public String getLevelFrame() {
        return levelFrame;
    }

    public void setLevelFrame(String levelFrame) {
        this.levelFrame = levelFrame;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

}
