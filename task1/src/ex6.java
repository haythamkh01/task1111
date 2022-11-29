import java.util.Scanner;

public class ex6 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = scanner.nextInt();
        int sum =0;
        while (a>0){
            int b = a%10;
            sum = sum + b;
            int c = a/10;
            a = c;

        }
        System.out.println("The sum of digit of a number is :" + sum);

    }



}
