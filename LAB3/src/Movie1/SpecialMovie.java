package Movie1;

import java.time.Duration;
public class SpecialMovie extends Movie {
    private String soundEffects;
    private String visualEffects;
    public SpecialMovie(String soundEffects, String visualEffects, String movieName, String producedBy, String directedBy,Duration duration,int year,String category){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;

    }
    public String getSoundEffects(){
        return soundEffects;
    }
    public String getVisualEffects(){
        return visualEffects;
    }
}
