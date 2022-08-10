import java.util.Arrays;

public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
         int[] expected = Arrays.copyOf(heights,heights.length);
         //cách 2: int[] expected = heights.clone();

         Arrays.sort(expected);
         int count=0;
         for (int i=0;i<heights.length;i++){
             if (heights[i]!=expected[i]){
                 count++;
             }
         }
         return count;
    }
}

