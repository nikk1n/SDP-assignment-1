//Prototype pattern for creating schedule templates
public interface MovieSchedule extends Cloneable{
    MovieSchedule clone();
    void setMovie(Movie movie);
    void setTime(String time);
}
class StandardSchedule implements MovieSchedule{
    private Movie movie;
    private String time;

    public StandardSchedule() {
    }

    public StandardSchedule(Movie movie, String time) {
    }

    @Override
    public MovieSchedule clone(){
        return new StandardSchedule(this.movie,this.time);
    }
    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

}