public class circle {
     public static void main(String[] args) {
        double radius = 7.5;
        double PI = 3.1415926535;
        
        // Perimeter (Circumference) = 2 * PI * r
        double perimeter = 2*PI*radius;
        
        // Area = PI * r * r
        double area = PI*radius*radius;
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
