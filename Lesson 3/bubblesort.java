import java.util.ArrayList;
public class bubblesort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) > numbers.get(j+1)) {
                int temp = numbers.get(j);
                numbers.set(j, numbers.get(j+1));
                numbers.set(j+1, temp);
            
            }
            }
        }
        // Arrays.toString(numbers) doesn’t work with ArrayLists — that’s for arrays.
        System.out.println(numbers);
    }
}