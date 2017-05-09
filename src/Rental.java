
import java.util.logging.Logger;

class Rental {
    private static final Logger LOG = Logger.getLogger(Rental.class.getName());
    private final Movie movie;
    private final int daysRented;
    Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
}