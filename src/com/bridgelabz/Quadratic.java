package com.bridgelabz;

public class Quadratic {
    public static void main(String[] args)
    {
         double a = 1, b = -2, c =12;
         double x, x1;
         double delta = b*b-4*a*c;

        if (delta > 0) {

            x = (-b+Math.sqrt(delta))/(2 * a);
            x1 = (-b-Math.sqrt(delta))/(2 * a);
            System.out.format(
                    "First Root = %.2f and Second Root = %.2f",
                    x, x1);
        }
        else if (delta == 0) {
            x=x1=-b/(2*a);
            System.out.format(
                    "First Root = Second Root = %.2f;",
                    x);
        }
        else {
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-delta) / (2 * a);

            System.out.printf("First Root = %.2f+%.2f",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2f",
                    real, imaginary);
        }
    }
}


