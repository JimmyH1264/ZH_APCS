public class Phone2 {
    private String model;
    private String color;
    public Phone2(String model, String color) {
        this.color = color;
        this.model = model;
        System.out.println("Your customized phone. Model:" + model + ". Color :" + color);
    }
    boolean wifiCheck;
    public String call(String Number) {
        String num = Number;
        System.out.println("you called" + num);
        return num;
    }
    public int setBrightness(int screen) {
        int brightness = screen;
        System.out.println("you brightness level is " + brightness + "%");
        return brightness;
    }
    public boolean wifi(int connection) {
        if (connection == 1) {
            System.out.println("you are connected to wifi");
            wifiCheck = true;
            return wifiCheck;
        }else{
            System.out.println("you are not connected to the wifi");
            wifiCheck = false;
            return wifiCheck;
        }
    }
    public void text(String people,String message) {
        System.out.println(" you texted" + people + ". Message :" + message);
    }
    public String toString() {
        return ("this is your phone " + color + " " + model);
    }
}   