public class Main {
    public static void main(String[] args) {
        double moneyInTheAccount = 100.5;
        double replenishment = 1000.46;
        double afterReplenishment = moneyInTheAccount + replenishment;
        int bonus = (int) afterReplenishment / 100;
        if(replenishment > 1_000) {
            System.out.println((afterReplenishment + bonus) + " вам начислено " + bonus + " бонусных рублей");
        }else {
            System.out.println(afterReplenishment + "  бонус не начислен");
        }
    }
}
