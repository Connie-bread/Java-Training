import java.util.ArrayList;
public class app {  
    public static void main(String args[]) {
        // saying integer list, two ways shown below
        // 76 - index 0 goes on etc.
        // have to use Capitilizzed Integer
        // array list can grow (add numbers)
        ArrayList<Integer> testScores= new ArrayList<>();
        testScores.add(90);
        testScores.add(75);
        testScores.add(60);
        int[] moreTestScores = new int[5]; // declares size of array


        testScores.set(2, 100);
        System.out.println(testScores);
        System.out.println(testScores.get(2));
        // cd .. = exit a folder
    }  
}
