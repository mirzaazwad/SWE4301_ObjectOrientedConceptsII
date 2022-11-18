package assignment2.ContentCoupling;

public class Calculator {
    //Tight Coupling for content coupling
    public int Sum(Numbers num){
        num.setResult(num.getFirstNumber()+ num.getSecondNumber());
        return num.getResult();
    }

    //loose coupling for content coupling
    public int sum(Numbers num){
        num.sumAndUpdateResult();
        return num.getResult();
    }
}
