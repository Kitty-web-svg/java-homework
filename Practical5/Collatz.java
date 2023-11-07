import java.util.ArrayList;
import java.util.Scanner;

public class Collatz{
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int newanswer;
    int counter = 1;
    public int collatz(int n){
        arr.add(n);
        if(n > 1){
        if (n % 2 == 1){
            newanswer = (n*3)+1;
            arr.add(newanswer);
            System.out.println("arr.add("+newanswer+")");
        }
        else{
            newanswer = n/2;
            arr.add(newanswer);
            System.out.println("arr.add("+newanswer+")");

        }
        while (newanswer != 1){
            counter ++;
            collatz(newanswer);
        }
        }
        else{
            throw new IllegalArgumentException();
        }
        return counter;
    }

    public static void main(String[] args) throws  IllegalArgumentException{
        Collatz collatz = new Collatz();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        try{
            System.out.println("For Initial n = "+n+" , it took "+collatz.collatz(n)+" steps to reach 1");
        }
        catch (Exception e){
            System.out.println("Please use valid n");
        };
        // for (int i = 0; i < arr.size(); i++){
        //     System.out.print(arr.get(i));
        //     System.out.print(" ");
        // }
        // System.out.print("\n");
    }
}