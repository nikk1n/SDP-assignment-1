public class CinemaConfig {
    private static CinemaConfig instance;

    private String cinemaName;
    private int screenNumber;
    private CinemaConfig(){}
    public synchronized static CinemaConfig getInstance(){
        if(instance==null){
            instance=new CinemaConfig();
        }
        return instance;
    }
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
