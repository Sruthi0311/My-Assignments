package Movie1;

import java.time.Duration;
public class InternationalMovie extends Movie {
    private String country;
    private String language;
    public String showDetails(){
        return movieName+" "+producedBy+" "+directedBy+" "+duration+" "+year+" "+category+" "+movieId+" "+country+" "+language;
    }
    public InternationalMovie(String country,String language,String movieName, String producedBy, String directedBy,Duration duration,int year,String category){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.country=country;
        this.language=language;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
}
