package fin4busongan_d;
class MetalElement extends Elemento {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void infoElement() {
        System.out.println("Metal Element:");
        System.out.println("Symbol: " + getSymbol());
        System.out.println("Atomic Number: " + getAtomicNumber());
        System.out.println("Atomic Weight: " + getAtomicWeight());
        System.out.println("Properties: Metals are good conductors of electricity.");
    }
}
