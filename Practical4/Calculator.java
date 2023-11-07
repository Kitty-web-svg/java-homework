public class Calculator{
    public int add(int num1, int num2) throws Exception{
        return num1 + num2; //return the result of add process

    }
    public int subtract(int num1, int num2) throws Exception{
        return num1-num2; //return the result of subtract process
    }
    public int multiply(int num1, int num2) throws Exception{
        return num1*num2; //return the result of multiply process
    }
    public int divide(int num1, int num2) throws Exception{
        if (num2 != 0){
            if (num1 % num2 != 0){
             throw new RunApp.NotDivibleException("Cannot divide!", new ArithmeticException("Cannot return fraction"));
        }
        }
        return num1/num2;
    }
}