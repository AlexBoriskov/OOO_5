package Сalculator;

public class CalculatorModel {
    
    private double result;

    //**Расчет суммы двух чисел */
    public void addition (double value01, double value02){
        result = value01 + value02;
    }

    public void difference (double value01, double value02){
        result = value01 - value02;
    }

    public void division (double value01, double value02){
        result = value01 / value02;
    }

    public void multiplication (double value01, double value02){
        result = value01 * value02;
    }

    public void exponentiation (double value01, double value02){
        result = Math.pow(value01, value02);
    }

    public double getResult() {
        return result;
    }
}
