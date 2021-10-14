package computeVAT;

public class CalculateVat {
    int PRCVAT;
    public CalculateVat(int PRCVAT) {
        this.PRCVAT = PRCVAT;
    }
    public double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
