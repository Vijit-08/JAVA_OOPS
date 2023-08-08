import java.util.Scanner;

class ComplexNumber{
    double real;
    double img;


    public ComplexNumber(double real , double img){
        this.real = real;
        this.img = img;
    }

    public ComplexNumber add(ComplexNumber other){
        double resultReal = this.real + other.real;
        double resultImg = this.img + other.img;
        return new ComplexNumber(resultReal, resultImg);
    }

    public ComplexNumber sub(ComplexNumber other){
        double resultReal = this.real - other.real;
        double resultImg = this.img - other.img;
        return new ComplexNumber(resultReal, resultImg);
    }

    public ComplexNumber mul(ComplexNumber other){
        double resultReal = this.real * other.real - this.img * other.img;
        double resultImg = this.real * other.img + this.img * other.real;
        return new ComplexNumber(resultReal, resultImg);
    }
    public ComplexNumber div(ComplexNumber other){
        double denominator = other.real * other.real + other.img * other.img;
        double resultReal = (this.real * other.real + this.img * other.img) / denominator;
        double resultImaginary = (this.img * other.real - this.real * other.img) / denominator;
        return new ComplexNumber(resultReal, resultImaginary);

    }

    public ComplexNumber inv(ComplexNumber other){
        double denominator = this.real * this.real + this.img * this.img;
        double resultReal = this.real / denominator;
        double resultImaginary  = this.img / denominator;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    @Override       
    public String toString() {
    return "(" + real + " + j " + img + ")";
}

}


public class exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of Complex Number 1:");
        double realPart1 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of Complex Number 1:");
        double imaginaryPart1 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(realPart1, imaginaryPart1);

        
    
        System.out.println("Enter the real part of Complex Number 2:");
        double realPart2 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of Complex Number 2:");
        double imaginaryPart2 = scanner.nextDouble();
        
        ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);

        scanner.close();


        ComplexNumber addition = num1.add(num2);
        ComplexNumber subtraction = num1.sub(num2);
        ComplexNumber product = num1.mul(num2);
        ComplexNumber division = num1.div(num2);
        ComplexNumber inverseNum1 = num1.inv(num1);
        ComplexNumber inverseNum2 = num2.inv(num2);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction " + subtraction);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Inverse Num 1: " + inverseNum1);
        System.out.println("Inverse Num 2: " + inverseNum2);
    }
}



