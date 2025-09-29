import java.util.*;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by spaces:");
        String input = sc.nextLine();

        String[] tokens = input.split(" ");
        for (String token : tokens) {
            // String to int -> Autoboxing into Integer when adding to ArrayList
            numbers.add(Integer.parseInt(token));
        }

        int sum = 0;
        for (Integer num : numbers) {
            // Unboxing Integer to int while summing
            sum += num;
        }

        System.out.println("The sum of integers = " + sum);
        sc.close();
    }
}
