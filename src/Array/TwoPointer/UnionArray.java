package Array.TwoPointer;
import java.util.ArrayList;
import Utility.*;

public class UnionArray {

    static ArrayList<Integer> unionArray(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i])
                    ans.add(a[i]);
                i++;
            }
            else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j])
                    ans.add(b[j]);
                j++;
            }
            else { // a[i] == b[j]
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i])
                    ans.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (ans.get(ans.size() - 1) != a[i])
                ans.add(a[i]);
            i++;
        }

        while (j < b.length) {
            if (ans.get(ans.size() - 1) != b[j])
                ans.add(b[j]);
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] a = InputArray.inputArray();
        int[] b = InputArray.inputArray();
        ArrayList<Integer> ans = unionArray(a,b);
        System.out.println(ans);
    }
}
