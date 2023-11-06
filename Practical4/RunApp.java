import java.util.Scanner;

public class RunApp{
    public static void main(String[] args){
        while(true){
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        char notation = input.next().charAt(0);
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
            case 'q':
                System.exit(0);
                break;
            case 'Q':
                System.exit(0);
                break;
        }
        }
    }
}