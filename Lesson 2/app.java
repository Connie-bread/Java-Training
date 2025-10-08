public class app {  
    public static void main(String args[]) {
        // [] = array
        // saying integer list, two ways shown below
        // 76 - index 0 goes on etc.
        int[] testScores = {76, 53, 89, 100, 32, 98};
        int[] moreTestScores = new int[5]; // declares size of array


        testScores[3] = 90;
        System.out.println(testScores);
        System.out.println(testScores[3]);
    }  
}
