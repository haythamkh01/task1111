import java.util.LinkedList;

public class ex7 {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int n = i;
            LinkedList<Integer> data = new LinkedList<>();
            while (n > 0) {
                data.push(n % 10);
                n = n / 10;
            }
            int sum = 0;

            for (Integer num : data) {
                sum += Math.pow(num, data.size());
            }

            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}