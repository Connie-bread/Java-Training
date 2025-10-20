import java.util.ArrayList;
import java.util.Scanner;
public class assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers= new ArrayList<>();

        System.out.println("How many numbers do you want?: ");
        int userNumbers = scanner.nextInt();
        // || means or
        if (userNumbers < 1 || userNumbers > 100) {
            System.out.println("error");
            scanner.close();
        } else {
            for (int i = 0; i < userNumbers; i++) {
            System.out.println("What do you want number " + (i + 1) + " to be?:");
            numbers.add(scanner.nextInt());
        }
        int total = 0;
        for (int number : numbers) {
            total += number; // total = total + number
        }
        // System.out.println(total);
        int average = Math.round(total / numbers.size());
        System.out.println("Average of your numbers: " + average);

        // Nested Loop info:
        // The outer loop index i counts how many full passes have happened.
        // The inner loop index j controls which two elements are being compared during each pass. (resets to 0 after each full pass))
        // there is a -i in the inner loop b/c the last i elements would have already been sorted --> think: 5,4,3,2,1
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j+1)) {
                int temp = numbers.get(j);
                numbers.set(j, numbers.get(j+1));
                numbers.set(j+1, temp);
            
            }
            }
        }
        // Arrays.toString(numbers) doesn’t work with ArrayLists — that’s for arrays.
        System.out.println("Your list of numbers from least to greatest: " + numbers);
        scanner.close();
        }



    }
}