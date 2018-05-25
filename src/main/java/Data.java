
public class Data  implements Comparable<Data>{
    private double dealer;
    private int incidence;

    public double getDealer() {
        return dealer;
    }

    public int getIncidence() {
        return incidence;
    }

    public Data(double dealer) {
        this.dealer = dealer;
        this.incidence = 1;
    }

    public Data(double dealer, int incidence) {
        this.dealer = dealer;
        this.incidence = incidence;
    }

    @Override
    public int compareTo(Data o) {
        return o.incidence - incidence;
    }

}
