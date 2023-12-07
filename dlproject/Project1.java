public class Area {
    private float Area;
    private float Radius;
    
    public double area(float radius, double PI){
        Radius = (float) (PI * radius * radius); 
        return Radius;
    }
    public float area(float base, float height){
        Area = (base * height)/2;
        return Area;
    }
    public float area(float side){
        Area = side * side;
        return Area;
    }
}

