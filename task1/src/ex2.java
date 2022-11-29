import java.util.Scanner;

public class ex2 {

        public static void main(String[] args){
        int a;
        int b;

                Scanner scanner =new Scanner(System.in);
                System.out.println("enter the first number in the series :");
                a = scanner.nextInt();
                System.out.println("Enter the difference :");
                b = scanner.nextInt();
                System.out.println("Enter the amount of organs ");
             int[] series = new int[scanner.nextInt()];

                for(int i=0;i< series.length;i++){
                        series[i]=a+b*i;
                        System.out.println(series[i]);
                }
        }
}