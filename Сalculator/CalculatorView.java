package Сalculator;

import java.util.Scanner;

public class CalculatorView {
    
    public void viewResult(double result){
        System.out.printf("Результат = %.2f", result);
    }

    public double userEnterData(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double input = iScanner.nextDouble();
        return input;
    }

    public int userChooise(){
        Scanner chooseScanner = new Scanner(System.in);
        System.out.print("Выберите операцию: ");
        int choose = chooseScanner.nextInt();
        return choose;
    }
}
