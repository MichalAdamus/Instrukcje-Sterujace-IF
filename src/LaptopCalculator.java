public class LaptopCalculator {
    public static void main(String[] args) {
        double laptopPriceHp = 3500.55;
        double laptopPriceAcer = 1750.45;
        double laptopPriceApple = 9999.99;

        if (laptopPriceHp < laptopPriceAcer) {
            if (laptopPriceHp < laptopPriceApple) {
                System.out.println("Najtańszy to HP");
            } else {
                System.out.println("Najtańszy będzie Apple");
            }
        } else {
            if (laptopPriceAcer < laptopPriceApple) {
                System.out.println("Najtańszy to Acer");
            } else {
                System.out.println("Najtańszy będzie Apple");
            }
        }

        // Drugi sposób rozwiązania zadania

        if (laptopPriceHp < laptopPriceAcer && laptopPriceHp < laptopPriceApple) {
            System.out.println("Laptop HP jest najtańszy");
        } else if (laptopPriceAcer < laptopPriceHp && laptopPriceAcer < laptopPriceApple) {
            System.out.println("Laptop Acer jest najtańszy");
        } else {
            System.out.println("Najtańszy będzie Apple");
        }
    }
}