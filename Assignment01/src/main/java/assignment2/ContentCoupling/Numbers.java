package assignment2.ContentCoupling;

public class Numbers {
    private int num1,num2,result;
    public Numbers(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int getFirstNumber(){
        return this.num1;
    }

    public int getSecondNumber(){
        return this.num2;
    }

    public void setResult(int result){
        this.result=result;
    }

    public int getResult(){
        return this.result;
    }

    public void sumAndUpdateResult(){
        this.result=this.num1+this.num2;
    }
}
