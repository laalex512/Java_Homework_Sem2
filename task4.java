package Sem2.Homework;

import java.util.Scanner;
import java.util.logging.Logger;

public class task4 {
    public static void main(String[] args) {
        double a, b;
        String operation;
        double result = 0;
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScan = new Scanner(System.in);
        System.out.printf("Insert a: ");
        a = iScan.nextDouble();
        logger.info("Input a = "+a);
        System.out.printf("Insert operation: ");
        operation = iScan.next();
        logger.info("Input operation = "+operation);
        System.out.printf("Insert b: ");
        b = iScan.nextDouble();
        logger.info("Input b = "+b);
        iScan.close();
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
        }
        logger.info(String.format("%.2f %s %.2f = %.2f", a, operation, b, result));
    }
}


