public class Number {
    /**
     * Műveletekhez használt szám double értéke.
     */
    private double number;
    /**
     * Műveletekhez használt szám tömb formában.
     */
    private int[] numberArray;
    /**
     * Szám osztály példányosítása.
     */
    public Number() {
        this.number = 0;
    }
    /**
     * Szám osztály példányosítása.
     *
     * @param number double érték
     */
    public Number(double number) {
        this.number = number;
    }
    /**
     * Szám lekérdező metódus.
     *
     * @return double érték
     */
    public double getNumber() {
        return number;
    }
    /**
     * Szám beállító metódus.
     *
     * @param number double érték
     */
    public void setNumber(double number) {
        this.number = number;
        setNumberArray();
        getLenght();
    }
    /**
     * Szám karakterhosszának lekérdezése.
     *
     * @return szám hoszsának értéke
     */
    public int getLenght() {
        return String.format("%.0f", number).length();
    }
    /**
     * Szám értékének növelése, léptető ciklus mértékének beállítása.
     */
    public void upNumber() {
        this.number = number+1;
    }
    /**
     * Maximális számérték lekérdezése, a léptető ciklus határértéke.
     *
     * @return maximális számérték
     */
    public double getMaxNumber() {
        return Double.MAX_VALUE;
    }
    /**
     * A szám értékeit tartalmazó tömb beállító metódusa.
     */
    public void setNumberArray() {
        String temp = String.format("%.0f", number);
        this.numberArray = new int[temp.length()];
        for (int i=0; i<temp.length(); i++){
            this.numberArray[i] = Character.getNumericValue(temp.charAt(i));
        }
    }
    /**
     * A szám értékeit tartalmazó tömböt lekérdező metódus.
     *
     * @return a szám értékeit tartalmazó tömb
     */
    public int[] getNumberArray() {
        return this.numberArray;
    }
    /**
     * A szám értékeit összegző metódus.
     *
     * @return összérték
     */
    public double getNumberAllSum() {
        double sum = 0;
        for (int i = 0; i < getNumberArray().length; i++){
            sum += getNumberArray()[i];
        }
        return sum;
    }
    /**
     * A szám utolsó értéke.
     *
     * @return utolsó érték
     */
    public int getNumberLast() {
        String temp = String.format("%.0f", number);
        return Character.getNumericValue(temp.charAt(getLenght()-1));
    }
    /**
     * A szám utolsó értékékének elhagyása.
     *
     * @return a szám tizade törtrész nélkül
     */
    public double getNumberFirstAll() {
        return getLenght() > 2 ? (number-getNumberLast()) / 10 : number;
    }
}
