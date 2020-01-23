public class GasPriceTracker {
    private double unleadG = 0.0;
    private double plusG = 0.0;
    private double premiumG = 0.0 ;
    public void price(double unleadG,double plusG, double premiumG){
        this.plusG = plusG;
        this.unleadG = unleadG;
        this.premiumG = premiumG;
        
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
    public void printG() {
        System.out.println("the prise for gas today is :");
        System.out.println("unleaded gas : $" + unleadG);
        System.out.println("plus gas : $" + plusG);
        System.out.println("premium gas : $" + premiumG);
    }
}