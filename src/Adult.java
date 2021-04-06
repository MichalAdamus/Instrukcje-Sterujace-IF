public class Adult {
    public static void main(String[] args) {
        int age = 19;
        if (age <= 13) {
            System.out.println();
            System.out.println("jesteś jeszcze dzieckiem");
        }else if (age < 18){
            System.out.println("jesteś jeszcze nastolatkiem");
        }else {
            System.out.println("Jesteś już pełnoletni");
        }
    }
}
