package ZCW.Api.models;

public class EndorsementModel {
    private int level;
    private String frame;
    private String icon;

    public EndorsementModel(int level, String frame, String icon){
        this.level = level;
        this.frame = frame;
        this.icon = icon;
    }

    public EndorsementModel(){}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
