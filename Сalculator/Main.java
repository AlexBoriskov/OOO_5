package Сalculator;

public class Main {
    public static void main(String[] args) {
    
        CalculatorPresent presenter = new CalculatorPresent(new CalculatorModel(), 
                                    new CalculatorView(), new Show());

        presenter.onCalculator();
    }    
}
