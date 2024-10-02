public interface Button {
    void render();
}
class DarkThemeButton implements Button{
    public void render(){
        System.out.println("Dark theme button rendered.");
    }
}
class LightThemeButton implements Button{
    public void render(){
        System.out.println("Light theme button rendered.");
    }
}
