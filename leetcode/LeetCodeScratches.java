
import java.util.ArrayList;

public class LeetCodeScratches {

  public static void main(String[] args) {
    
    
      
  }

  public static Boolean twoSum(int sum, int[] inputs) {

    HashSet set = new HashSet();

    for(int a: inputs) {
        if (set.contains(sum-a)){
            return true;
        }

        set.add(a);
    }

    return false;
  }
}


