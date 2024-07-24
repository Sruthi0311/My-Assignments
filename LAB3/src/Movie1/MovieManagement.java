package Movie1;
import java.time.Duration;
public class MovieManagement {
    public static void main(String args[]){
        Movie movie1 = new Movie("Friends","Appachan","Siddique",(Duration.ofHours(2)).plusMinutes(47),2001,"Comedy/Drama");
        SpecialMovie movie2 = new SpecialMovie("DoldByAtmos","VFX","Kadhalum Kadandhu Pogum","C.V.Kumar","Nalan",Duration.ofHours(2).plusMinutes(10),2016,"Romantic/Comedy");
        InternationalMovie movie3 = new InternationalMovie("United States","English","Avatar","Jon Landau","James Cameron",Duration.ofHours(2).plusMinutes(58),2009,"Science Fiction/Animation");

        System.out.println("Movie: "+"Name: "+movie1.getMovieName()+", "+"Produced By: "+movie1.getProducedBy()+", "+"Directed By: "+movie1.getDirectedBy()+", "+"Duration: "+movie1.getDuration()+", "+"Released in the Year: "+movie1.getYear()+", "+"Category: "+movie1.getCategory());
        System.out.println("Special Movie: "+"Sound Effects: "+movie2.getSoundEffects()+", "+"Visual Effects: "+movie2.getVisualEffects()+", "+"Name: "+movie2.getMovieName()+", "+"Produced By: "+movie2.getProducedBy()+", "+"Directed By: "+movie2.getDirectedBy()+", "+"Duration: "+movie2.getDuration()+", "+"Released in the Year: "+movie2.getYear()+", "+"Category: "+movie2.getCategory());
        System.out.println("International Movie: "+"Country Of Origin: "+movie3.getCountry()+", "+"Language: "+movie3.getLanguage()+", "+"Name: "+movie3.getMovieName()+", "+"Produced By: "+movie3.getProducedBy()+", "+"Directed By: "+movie3.getDirectedBy()+", "+"Duration: "+movie3.getDuration()+", "+"Released in the Year: "+movie3.getYear()+", "+"Category"+movie3.getCategory());
        System.out.println("Total Movie Count: "+Movie.getMoviesCount());

    }
}
