public class Number {

    double number;
    private int[] numberArray;

    public Number() {
        this.number = 0;
    }

    public Number(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
        setNumberArray();
        getLenght();
    }

    public int getLenght() {
        return String.format("%.0f", number).length();

    }

    public void upNumber() {
        this.number = number+1;
    }

    public double getMaxNumber() {
        return 1.7976931348623157E308;
    }

    public void setNumberArray() {
        String temp = String.format("%.0f", number);
        for (int i=0; i<temp.length(); i++){
            this.numberArray = new int[temp.length()];
            this.numberArray[i] = Character.getNumericValue(temp.charAt(i));
        }
    }

    public int[] getNumberArray() {
        return this.numberArray;
    }

    public double getNumberAllSum() {
        double sum = 0;
        for (int i = 0; i < getNumberArray().length; i++){
            sum += getNumberArray()[i];
        }
        return sum;
    }
    public int getNumberLast() {
        String temp = String.format("%.0f", number);
        return Character.getNumericValue(temp.charAt(getLenght()-1));
    }

    public double getNumberFirstAll() {
        return getLenght() > 2 ? (number-getNumberLast()) / 10 : number;
    }
}
