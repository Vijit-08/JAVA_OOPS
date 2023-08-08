import java.util.Scanner;
class Circle{
    double radius;

    Circle(double radius){
        this.radius = radius ;
    }
    
    double getArea(){
        return Math.PI * radius * radius;
    }
    double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

class CirclePA{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius =  scanner.nextDouble();

            try {
                radius = scanner.nextDouble();
                if (radius <= 0) {
                    System.out.println("Error: Radius must be a positive number.");
                    return;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid numeric value.");
                return;
            }

            Circle circle = new Circle(radius);

            double perimeter = circle.getPerimeter();
            double area =  circle.getArea();
            
            System.out.println("perimeter of the circle is :"+ perimeter);
            System.out.println("Area of the circle is :"+ area);
        }
    }
}
