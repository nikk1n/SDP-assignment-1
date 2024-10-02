public interface TextField {
    void render();
}
class LightThemeTextField implements TextField{
    public void render(){
        System.out.println("Light theme text field rendered.");
    }
}
class DarkThemeTextField implements TextField{
    public void render(){
        System.out.println("Dark theme text field rendered");
    }
}
