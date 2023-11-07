import java.util.Scanner;
import java.util.InputMismatchException;


public class RunApp{
    public static class NotDivibleException extends Exception{
        public NotDivibleException(String msg, Throwable cause){
            super(msg +cause.toString());
        }
    }
    public static int Divide(int num1, int num2) throws Exception{
        Calculator calculator = new Calculator();
        int result = 0;
        try{
        result = calculator.divide(num1,num2);}
        catch(NotDivibleException e){
            throw new NotDivibleException("Cannot divide!", e);
        };
        return result;
    }
    public static void main(String[] args) throws Exception{
        while(true){
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        try{
        int num1 = input.nextInt();
        char notation = input.next().charAt(0);
        if (notation != '*' && notation != '+' && notation != '-' &&  notation != 'q' && notation != 'Q' && notation != '/'){
            throw new InputMismatchException();
        }
        int num2 = input.nextInt();
        switch(notation){
            case '+':
                System.out.println(calculator.add(num1,num2));
                break;
            case '-':
                System.out.println(calculator.subtract(num1,num2));
                break;
            case '*':
                System.out.println(calculator.multiply(num1,num2));
                break;
             case '/':
                System.out.println(RunApp.Divide(num1,num2));
                break;
            case 'q':
                System.exit(0);
                break;
            case 'Q':
                System.exit(0);
                break;
            default:
                throw new InputMismatchException();
        }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
            input.nextLine();
        }
        catch(NotDivibleException e){
            System.out.println(e.getMessage());
            input.nextLine();
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
            input.nextLine();
        };
        }
    }
}