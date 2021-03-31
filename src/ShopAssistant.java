public class ShopAssistant {
    public static void main(String[] args) {
        double cash = 5;
        double breadPrice = 2.1;
        double butterPrice = 3.41;
        double rollPrice = 0.58;

        if(breadPrice + butterPrice < cash) {
            System.out.println("Kupiłem chleb i masło");
        }else if (2*rollPrice + butterPrice <= cash){
            System.out.println("Kupiłem 2 bułki oraz masło");
        }else if(rollPrice <= cash) {
            System.out.println("Kupiłem tylko bułkę");
        }else {
                System.out.println("Nic nie kuiłem");
            }
        }
    }