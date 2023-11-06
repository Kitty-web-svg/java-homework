ackage mypkg;

import java.util.Scanner;
public class Problem1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int sum = 0;
        if (start > end){
            System.out.println("Start number shouldn't be bigger than end number!");
        }
        else{
        for (int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println(sum);
        }
    }
}