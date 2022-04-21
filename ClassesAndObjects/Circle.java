package ClassesAndObjects;

public class Circle {
    // public double radius;

    public double area(double radius){
        return 3.14 * radius * radius;
    }

    public double circumference(double radius){
        return 2 * 3.14 * radius;
    }
    
}

class MyMain{
    public static void main(String[] args) {
        Circle aCircle = new Circle();
        System.out.println(aCircle.area(7));
        
    }
}
