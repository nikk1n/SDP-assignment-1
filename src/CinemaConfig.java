//Singleton pattern
public class CinemaConfig {
    private static CinemaConfig instance;

    private String cinemaName;
    private int screenNumber;
    private CinemaConfig(){}
    //Creates an instance if it doesn't exist or accesses an existing one
    public synchronized static CinemaConfig getInstance(){
        if(instance==null){
            instance=new CinemaConfig();
        }
        return instance;
    }
    //getters and setters
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public int getScreenNumber() {
        return screenNumber;
    }




}
