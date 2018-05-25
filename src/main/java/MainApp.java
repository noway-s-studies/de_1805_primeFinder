public class MainApp {
    /**
     * Prímtesztelő osztály példánya.
     */
    private static PrimeNumber prime = new PrimeNumber();
    /**
     * Kezdőérték.
     */
    private static final double STARTNO = 40;

    public static void main(String[] args) {
        start();
    }

    /**
     * Indítási metódus.
     */
    private static void start() {
        /**
         * Léptető ciklus.
         */
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
