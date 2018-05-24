public class PrimeNumber extends Number {
    private boolean prime;
    private boolean status;
    private Number number;
    private Number newNumber = new Number();
    public PrimeNumber() {
        super();
        this.prime = false;
        this.status = true;
    }
    public void resetPrime() {
        this.prime = false;
        this.status = true;
    }
    public void setPrime(boolean prime) {
        this.prime = prime;
        this.status = false;
    }
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
        if (status){
            setPrime(end40Prime());
        }
        return prime;
    }

    private void printNotPrime(long i2) {
//        System.out.println("Not príme: " + String.format("%.0f", number.getNumber()) + "/" + i2);
    }
    private void n2(){
        int last = getNumberLast();
        if(last == 0 || last == 2 || last == 4 || last == 6 || last == 8) {
            setPrime(false);
            printNotPrime(2);
        }
    }
    private void n3(){
        if(getNumberAllSum() != 0 && getNumberAllSum()%3 == 0) {
            setPrime(false);
            printNotPrime(3);
        }
    }
    private void n5() {
        if(getNumberLast() == 0 || getNumberLast() == 5) {
            setPrime(false);
            printNotPrime(5);
        }
    }
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

    private void setLocalPrimeAndPrint(Number newNumber, int i2) {
        if (newNumber.getNumber() % i2 == 0) {
            setPrime(false);
            printNotPrime(i2);
        }
    }

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
    private boolean end40Prime() {
        for(long i = 2; i < Math.sqrt(number.getNumber()); i += 1) {
            if(number.getNumber()%i == 0) {
                printNotPrime(i);
                this.status = false;
                return false;
            }
        }
        return true;
    }
}
