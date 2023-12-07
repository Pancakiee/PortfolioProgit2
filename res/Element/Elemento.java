package fin4busongan_d;

public abstract class Elemento {
    protected String symbol;
    protected int atomicNumber;
    protected double atomicWeight;

    public Elemento(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void infoElement();
}