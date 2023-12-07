package fin4busongan_d;

public class TestElement {
    public static void main(String[] args) {
        Elemento[] elements= new Elemento[4];
        elements[0] = new MetalElement("Fe", 26, 55.85);
        elements[1] = new MetalElement("Ar", 18, 39.9);
        elements[2] = new NonMetalElement("Co", 27, 58.93319);
        elements[3] = new NonMetalElement("Dy", 66, 162.500);
   
    
        for (Elemento element : elements) {
            element.infoElement();
            System.out.println();
        }
    }
}

