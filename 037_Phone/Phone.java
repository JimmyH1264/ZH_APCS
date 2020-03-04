public class Phone {
    boolean wifiCheck;
    public String call(String Number) {
        String num = Number;
        System.out.println("you called" + num);
        return num;
        //return a number so you can print the call statement again
    }
    public int setBrightness(int screen) {
        int brightness = screen;
        System.out.println("you brightness level is " + brightness + "%");
        return brightness;
        //tells you a variable that says brightness level
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
        //return wifi and 1 for yes other for no
    }
    public void text(String people,String message) {
        System.out.println(" you texted" + people + ". Message :" + message);
    }
    //this doesnt return anything but hands you back a printstatement
}                                               