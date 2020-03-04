public class GasPriceTracker {
    private double unleadG = 0.0;
    private double plusG = 0.0;
    private double premiumG = 0.0 ;
    //private strings so you cant  really change it in main0
    public void price(double unleadG,double plusG, double premiumG){
        this.plusG = plusG;
        this.unleadG = unleadG;
        this.premiumG = premiumG;
        //this declare variable for the prices
    }
    public double getPlus() {
        return plusG;
    }
    public double getUnlead() {
        return unleadG;
    }
    public double getPremium() {
        return premiumG;
    }
    //those gets the price of the custom price
    public void printG() {
        System.out.println("the prise for gas today is :");
        System.out.println("unleaded gas : $" + unleadG);
        System.out.println("plus gas : $" + plusG);
        System.out.println("premium gas : $" + premiumG);
    }
    //prints a poster about the price today
}