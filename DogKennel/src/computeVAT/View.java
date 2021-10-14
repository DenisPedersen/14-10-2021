package computeVAT;

public class View {
    String CURRENCY;
    String MSG;
    public  View(String CURRENCY, String MSG) {
              this.CURRENCY = CURRENCY;
              this.MSG = MSG;

    }
    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);

    }

}
