import java.util.Scanner;

 public  class ex5 {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num<0){
            System.out.println("please enter a positive number only:");
        }
        else {
            int a =0,b=1,c=0;
            while(c<num){
                c=a+b;
                a=b;
                b=c;
            }
            if(c==num){
                System.out.println("Your number "+ num+   "is belong to fibonacci numbers");
            }
            else{
                System.out.println("Your number is "+ num + "does not belong to fibonacci number");
            }
        }
    }
}










