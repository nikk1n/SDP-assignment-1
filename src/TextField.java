public interface TextField {
    void render();
}
class LightThemeTextField{
    public void render(){
        System.out.println("Light theme text field rendered.");
    }
}
class DarkThemeTextField{
    public void render(){
        System.out.println("Dark theme text field rendered");
    }
}
