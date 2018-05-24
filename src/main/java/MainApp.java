public class MainApp {

    private static PrimeNumber prime = new PrimeNumber();
    public static final double STARTNO = 999999998;
    public static double db;

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        for (prime.setNumber(STARTNO);
             prime.getNumber()<=prime.getMaxNumber();
             prime.upNumber()){
            prime.resetPrime();
            if (prime.isPrime(prime.getNumber())){
                System.out.println("Prime: "+String.format("%.0f", prime.getNumber()));
            }
        }


    }

}
