import java.util.*;

public class Main {

    public static List<int[]> indicesSum(int[] arrayOne, int[] arrayTwo, int inputSum) {

        List<int []> indices = new ArrayList<>();

        for(int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] + arrayTwo[j] == inputSum) {
                    indices.add(new int[] { i, j });
                }
            }
        }

        if (indices.isEmpty()) {
            indices.add(new int[] { -1, -1 });
        }

        return indices;
    }


    public static void main(String[] args) {

        int[] arrayOne = {9, 5, 0, -1};
        int[] arrayTwo = {8, 11, 2, 17};

        List<int []> result = indicesSum(arrayOne, arrayTwo, 7);

        result.forEach(r -> System.out.println(Arrays.toString(r)));


    }
}