package Movie1;
import java.time.Duration;
public class MovieManagement {
    public static void main(String args[]) {
        Movie movies[] = new Movie[3];


        movies[0] = new Movie("Friends", "Appachan", "Siddique", (Duration.ofHours(2)).plusMinutes(47), 2001, "Comedy/Drama");
        movies[1] = new SpecialMovie("DoldByAtmos", "VFX", "Kadhalum Kadandhu Pogum", "C.V.Kumar", "Nalan", Duration.ofHours(2).plusMinutes(10), 2016, "Romantic/Comedy");
        movies[2] = new InternationalMovie("United States", "English", "Avatar", "Jon Landau", "James Cameron", Duration.ofHours(2).plusMinutes(58), 2009, "Science Fiction/Animation");
//        System.out.println("Movie: "+"Name: "+movies[0].getMovieName()+", "+"Produced By: "+movies[0].getProducedBy()+", "+"Directed By: "+movies[0].getDirectedBy()+", "+"Duration: "+movies[0].getDuration()+", "+"Released in the Year: "+movies[0].getYear()+", "+"Category: "+movies[0].getCategory());
////        System.out.println("Special Movie: "+"Sound Effects: "+movies[1].getSoundEffects()+", "+"Visual Effects: "+movies[1].getVisualEffects()+", "+"Name: "+movies[1].getMovieName()+", "+"Produced By: "+movies[1].getProducedBy()+", "+"Directed By: "+movies[1].getDirectedBy()+", "+"Duration: "+movies[1].getDuration()+", "+"Released in the Year: "+movies[1].getYear()+", "+"Category: "+movies[1].getCategory());
////        System.out.println("International Movie: "+"Country Of Origin: "+movies[2].getCountry()+", "+"Language: "+movies[2].getLanguage()+", "+"Name: "+movies[2].getMovieName()+", "+"Produced By: "+movies[2].getProducedBy()+", "+"Directed By: "+movies[2].getDirectedBy()+", "+"Duration: "+movies[2].getDuration()+", "+"Released in the Year: "+movies[2].getYear()+", "+"Category"+movies[2].getCategory());
        //System.out.println("Total Movie Count: "+Movie.getMoviesCount());


        for (int i = 0; i < movies.length; i++) {
            if (movies[i] instanceof SpecialMovie) {
                SpecialMovie specialMovies = (SpecialMovie) movies[i];
                System.out.println("Special Movie: " + "Sound Effects: " + specialMovies.getSoundEffects() + ", " + "Visual Effects: " + specialMovies.getVisualEffects() + ", " + "Name: " + specialMovies.getMovieName() + ", " + "Produced By: " + specialMovies.getProducedBy() + ", " + "Directed By: " + specialMovies.getDirectedBy() + ", " + "Duration: " + specialMovies.getDuration() + ", " + "Released in the Year: " + specialMovies.getYear() + ", " + "Category: " + specialMovies.getCategory());

            } else if (movies[i] instanceof InternationalMovie) {
                InternationalMovie internationalMovies = (InternationalMovie) movies[i];
                System.out.println("International Movie: " + "Country Of Origin: " + internationalMovies.getCountry() + ", " + "Language: " + internationalMovies.getLanguage() + ", " + "Name: " + internationalMovies.getMovieName() + ", " + "Produced By: " + internationalMovies.getProducedBy() + ", " + "Directed By: " + internationalMovies.getDirectedBy() + ", " + "Duration: " + internationalMovies.getDuration() + ", " + "Released in the Year: " + internationalMovies.getYear() + ", " + "Category" + internationalMovies.getCategory());
            } else {
                System.out.println("Movie: " + "Name: " + movies[i].getMovieName() + ", " + "Produced By: " + movies[i].getProducedBy() + ", " + "Directed By: " + movies[i].getDirectedBy() + ", " + "Duration: " + movies[i].getDuration() + ", " + "Released in the Year: " + movies[i].getYear() + ", " + "Category: " + movies[i].getCategory());
            }
        }
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] instanceof SpecialMovie) {
                SpecialMovie specialMovies = (SpecialMovie) movies[i];
                System.out.println("Special Movie: " + specialMovies.showDetails());

            } else if (movies[i] instanceof InternationalMovie) {
                InternationalMovie internationalMovies = (InternationalMovie) movies[i];
                System.out.println("International Movie: " + internationalMovies.showDetails());
            } else {
                System.out.println("Movie: " + "Name: " + movies[i].showDetails());
            }
        }
        System.out.println("Total Movie Count: " + Movie.getMoviesCount());
    }
}
