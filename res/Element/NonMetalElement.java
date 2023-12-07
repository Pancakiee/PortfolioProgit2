package fin4busongan_d;

class NonMetalElement extends Elemento {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void infoElement() {
        System.out.println("Non-Metal Element:");
        System.out.println("Symbol: " + getSymbol());
        System.out.println("Atomic Number: " + getAtomicNumber());
        System.out.println("Atomic Weight: "  + getAtomicWeight());
        System.out.println("Properties: Nonmetals are poor conductors of electricity.");
    }
}