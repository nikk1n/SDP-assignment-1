//Abstract factory pattern for making UI themes
public interface UIFactory {
    Button createButton();
    TextField createTextField();
}
class DarkThemeFactory implements UIFactory{
    public Button createButton(){
       return new DarkThemeButton();
    }
    public TextField createTextField(){
        return new DarkThemeTextField();
    }
}
class LightThemeFactory implements UIFactory{
    public Button createButton(){ return new LightThemeButton();}
    public TextField createTextField(){ return new LightThemeTextField();}
}