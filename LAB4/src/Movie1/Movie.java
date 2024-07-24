package Movie1;

import java.time.Duration;
public class Movie {
    String movieName;
    String producedBy;
    String directedBy;
    Duration duration;
    int year;
    String category;
    private static int moviesCount=0;
    public static String movieId;
    Movie movie;
    public String showDetails(){
        return movieName+" "+producedBy+" "+directedBy+" "+duration+" "+year+" "+category+" "+movieId;
    }

    public Movie(String movieName, String producedBy, String directedBy, Duration duration, int year, String category) {
        this(movieName,producedBy);
        this.directedBy=directedBy;
        this.duration=duration;
        this.year=year;
        this.category=category;
        moviesCount++;
        movieId=movieName+" "+moviesCount;
    }

    public String getMovieName(){
        return movieName;
    }
    public String getProducedBy(){
        return producedBy;
    }
    public String getDirectedBy(){
        return directedBy;
    }
    public Duration getDuration(){
        return duration;
    }
    public int getYear(){
        return year;
    }
    public String getCategory(){
        return category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }

    Movie(String movieName,String producedBy){
        if(movieName==null||movieName.isEmpty()){
            throw new IllegalArgumentException();
        }
        if(producedBy==null||producedBy.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.movieName=movieName;
        this.producedBy=producedBy;
    }



}

