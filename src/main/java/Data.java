
public class Data  implements Comparable<Data>{
    /**
     * Osztó értéke;
     */
    private double dealer;
    /**
     * Osztó előfordulási értéke.
     */
    private int incidence;

    /**
     * Az osztó értékét lekérdező metódus.
     *
     * @return osztó értéke
     */
    public double getDealer() {
        return dealer;
    }

    /**
     * Az osztó előfordulási értékét lekérdező metódus.
     *
     * @return előfordulás értéke
     */
    public int getIncidence() {
        return incidence;
    }

    /**
     * Adat példányosító.
     * Az előfordulás alapértelmezetten 1.
     *
     * @param dealer osztó megadása
     */
    public Data(double dealer) {
        this.dealer = dealer;
        this.incidence = 1;
    }

    /**
     * Adat példányosító.
     *
     * @param dealer osztó
     * @param incidence előfordulás
     */
    public Data(double dealer, int incidence) {
        this.dealer = dealer;
        this.incidence = incidence;
    }

    /**
     * Adatok összehasonlítása.
     *
     * @param o adattag objektum
     * @return magasabb előfordulás esetén pozitív
     */
    @Override
    public int compareTo(Data o) {
        return o.incidence - incidence;
    }

}
