import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeNumber extends Number {
    private List<Data> dealerData;

    /**
     * Prím érték tőrolása, igaz/hamis.
     */
    private boolean prime;
    /**
     * Prím érték meghatározásának tőrolása, igaz/hamis.
     * Ha igaz akkor még nem határozta meg a prím értékét.
     */
    private boolean status;
    /**
     * A szám műveleteket végző osztály egy példánya.
     */
    private Number number;
    /**
     * A szám műveleteket végző osztály egy példánya, az ideiglenes értékekhez.
     */
    private Number newNumber = new Number();

    /**
     * A prímtesztelő osztály példányosítója
     */
    public PrimeNumber() {
        super();
        this.prime = false;
        this.status = true;
        dealerData = new ArrayList<>();
    }
    /**
     * A prím osztály alapértékeit beállító metodus.
     */
    public void resetPrime() {
        this.prime = false;
        this.status = true;
    }
    /**
     * A prím (és vele együt a státusz) értékét beállító metódus.
     *
     * @param prime új prím érték
     */
    public void setPrime(boolean prime) {
        this.prime = prime;
        this.status = false;
    }
    /**
     * A prím értékék meghatározó metódus.
     *
     * @param number vizsgált szám
     * @return prím értéke
     */
    public boolean isPrime(double number) {
        this.number = new Number(number);
        if (status){
            n2();
        }
        if (status){
            n3();
        }
        if (status){
            n5();
        }
        if (status){
            n7();
        }
        if (status){
            n11();
        }
        if (status){
            n13();
        }
        if (status){
            n17();
        }
        if (status){
            n19();
        }
        if (status){
            n23();
        }
        if (status){
            n29();
        }
        if (status){
            n31();
        }
        if (status){
            n37();
        }
        Collections.sort(dealerData);
        if (dealerData.size()>99999){
            dealerData.removeAll(dealerData);
        }
        for (int n = 0; n < dealerData.size() && n < 100 && status; n++ ){
            masterPrimeTester(this.number, dealerData.get(n).getDealer());
//            System.out.println("Top" + n + ": "+dealerData.get(n).getDealer()+" / "+dealerData.get(n).getIncidence()+"db");
        }
        if (status){
            setPrime(end40Prime());
        }
        return prime;
    }
    /**
     * Információkiíró metódus.
     * Amennyiben a szám nem prím, kiírja a legkissebb számot amivel osztható.
     *
     * @param i2 legkissebb osztó
     */
    public void printNotPrime(double i2) {
        boolean find = true;
        for (int i = 0; i < dealerData.size(); i++){
            if(dealerData.get(i).getDealer() == i2){
                dealerData.set(i,new Data(i2,dealerData.get(i).getIncidence()+1));
                find = false;
            }
        }
        if (find && i2 > 40){
            dealerData.add(new Data(i2));
        }
        System.out.println("Not príme: " + String.format("%.0f", number.getNumber()) + "/" + String.format("%.0f", i2));
    }
    /**
     * Oszthatóság vizsgáló metódus.
     *
     * @param number a vizsgált szám osztály egy példánya
     * @param n osztó
     */
    private void setLocalPrimeAndPrint(Number number, int n) {
        if (number.getNumber() % n == 0) {
            setPrime(false);
            printNotPrime(n);
        }
    }
    /**
     * Oszthatóság vizsgáló metódus.
     *
     * @param number a vizsgált szám osztály egy példánya
     * @param n osztó
     */
    private void masterPrimeTester(Number number, double n) {
        if (number.getNumber() % n == 0) {
            setPrime(false);
//            printNotPrime(n);
            System.out.println("Not Prime: " +String.format("%.0f", number.getNumber()) + "/" + String.format("%.0f", n) + " TOP!");
        }
    }
    /**
     * Kettővel való oszthatóság vizsgálata.
     */
    private void n2(){
        int last = getNumberLast();
        if(last == 0 || last == 2 || last == 4 || last == 6 || last == 8) {
            setPrime(false);
            printNotPrime(2);
        }
    }
    /**
     * Hárommal való oszthatóság vizsgálata.
     */
    private void n3(){
        if(getNumberAllSum() != 0 && getNumberAllSum()%3 == 0) {
            setPrime(false);
            printNotPrime(3);
        }
    }
    /**
     * Öttel való oszthatóság vizsgálata.
     */
    private void n5() {
        if(getNumberLast() == 0 || getNumberLast() == 5) {
            setPrime(false);
            printNotPrime(5);
        }
    }
    /**
     * Héttel való oszthatóság vizsgálata.
     */
    private void n7() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() - (newNumber.getNumberLast() * 2));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 7);
    }
    /**
     * Tizenegyel való oszthatóság vizsgálata.
     */
    private void n11() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() - (newNumber.getNumberLast()));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 11);
    }
    /**
     * Tizenhárommal való oszthatóság vizsgálata.
     */
    private void n13() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() + (newNumber.getNumberLast()*4));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 13);
    }
    /**
     * Tizenhéttel való oszthatóság vizsgálata.
     */
    private void n17() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() - (newNumber.getNumberLast() * 5));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 17);
    }
    /**
     * Tizenkilenccel való oszthatóság vizsgálata.
     */
    private void n19() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() + (newNumber.getNumberLast() * 2));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 19);
    }
    /**
     * Huszonhárommal való oszthatóság vizsgálata.
     */
    private void n23() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() + (newNumber.getNumberLast() * 7));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 23);

    }
    /**
     * Huszonkilenccel való oszthatóság vizsgálata.
     */
    private void n29() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() + (newNumber.getNumberLast() * 3));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 29);
    }
    /**
     * Harminceggyel való oszthatóság vizsgálata.
     */
    private void n31() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() - (newNumber.getNumberLast() * 3));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 31);

    }
    /**
     * Harminchéttel való oszthatóság vizsgálata.
     */
    private void n37() {
        newNumber.setNumber(number.getNumber());
        int len = newNumber.getLenght();
        if (len>3){
            for (int i = 0; i < len-1; i++) {
                newNumber.setNumber(newNumber.getNumberFirstAll() - (newNumber.getNumberLast() * 11));
                len = newNumber.getLenght();
            }
        }
        setLocalPrimeAndPrint(newNumber, 37);

    }
    /**
     * Általános oszthatóság vizsgálata.
     */
    private boolean end40Prime() {
        for(long i = 2; i < Math.sqrt(number.getNumber()); i++) {
            if(number.getNumber()%i == 0) {
                printNotPrime(i);
                this.status = false;
                return false;
            }
        }
        return true;
    }
}
