package Сalculator;

public class CalculatorPresent {
    private CalculatorModel model;
    private CalculatorView view;
    private Show show;
    private boolean proverka;
    private boolean status;
    private double result;


    public CalculatorPresent(CalculatorModel model, CalculatorView view, Show show) {
        this.model = model;
        this.view = view;
        this.proverka = true;
        this.show = show;
        this.status = true;
        this.result = 0;
    }

    public void onCalculator(){
        while (proverka){
            show.showMain();
            // int choose = view.userChooise();
            switch (view.userChooise()) {
                case 0:{
                    status = true;
                    result = 0;
                    break;
                }
                case 1:
                    if (status){
                        model.addition(view.userEnterData(), view.userEnterData());
                        status = false;
                        }
                    else model.addition(result, view.userEnterData());
                    break;

                case 2:
                    if (status){
                        model.difference(view.userEnterData(), view.userEnterData());
                        status = false;
                        }
                    else model.difference(result, view.userEnterData());
                    break;
                case 3:
                    if (status){
                        model.multiplication(view.userEnterData(), view.userEnterData());
                        status = false;
                        }
                    else model.multiplication(result, view.userEnterData());
                    break;
                case 4:
                    if (status){
                        model.division(view.userEnterData(), view.userEnterData());
                        status = false;
                        }
                    else model.division(result, view.userEnterData());
                    break;
                case 5:
                    if (status){
                        model.exponentiation(view.userEnterData(), view.userEnterData());
                        status = false;
                        }
                    else model.exponentiation(result, view.userEnterData());
                    break;
                case 6:
                    proverka = false;
                    System.out.println("До свидания!");
                    break;
            }
            result = model.getResult();
            view.viewResult(result);
        }
    }
}
