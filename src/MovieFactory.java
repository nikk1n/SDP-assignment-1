//Factory pattern for creating movies
public interface MovieFactory {
    Movie createMovie(String title);
}
class RegularMovieFactory implements MovieFactory{
    @Override
    public RegularMovie createMovie(String title){
        return new RegularMovie(title);
    }
}
class IMAXMovieFactory implements MovieFactory{

    @Override
    public IMAXMovie createMovie(String title) {
        return new IMAXMovie(title);
    }
}