public class MeterCalculator {
    public static void main(String[] args) {
        int meter = 10005;
        if (meter <= 300) {
            System.out.println();
            System.out.println("Żabka jest tuż za rogiem, poćwicz nogi i zrób sobie spacer");
        } else if (meter <= 2700) {
            System.out.println("Żabka jest troche dalej, skorzystaj z rowera");
        } else if (meter <= 10000) {
            System.out.println("Żabka jest daleko, skorzystaj z samochodu");
        } else {
            System.out.println("Żabka jest za daleko, nie wygłupiaj się, idz na lotnisko i leć samolotem");
        }
    }
}

