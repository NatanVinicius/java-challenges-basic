package CalculadoraSimples;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o valor 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação: ");
        String op = scanner.next();

        double total = 0;

        switch (op) {
            case "+":
                total = sum(num1, num2);
                break;
            case "-":
                total = minus(num1, num2);
                break;
            case "*":
                total = multiply(num1, num2);
                break;
            case "/":
                if(num2 == 0) {
                    total = 1;
                    break;
                }
                total = division(num1, num2);
                break;
        }

        System.out.println(total);
    }

    public static double sum(double n1, double n2) {
        return n1+n2;
    }

    public static double minus(double num1, double num2) {
        return num1-num2;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;
    }

    public static double division(double num1, double num2) {
        return num1/num2;
    }

}
