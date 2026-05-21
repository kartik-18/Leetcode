// class Solution {
//     public int longestCommonPrefix(int[] arr1, int[] arr2) {
//         int n = arr1.length;
//         int m = arr2.length;
//         int ans = 0;
//         for(int i = 0 ; i < n ; i ++){
//             for(int j = 0 ; j < m ; j++){
//                 ans  = Math.max(ans, prefixCount(arr1[i], arr2[j]));
//             }
//         }
//         return ans;
//     }

//     public int prefixCount(int a , int b){
//         String a1 = Integer.toString(a);
//         String b1  = Integer.toString(b);
//         int count = 0;
//         int len = Math.min(a1.length(), b1.length());

//         for(int i = 0 ; i < len ; i++){
//             if(a1.charAt(i) == b1.charAt(i))
//                 count++;
//             else
//                 break;
//         }
//         return count;
//     }
// }
import java.util.*;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();

        // Store all prefixes from arr1
        for (int num : arr1) {

            String s = Integer.toString(num);

            for (int i = 1; i <= s.length(); i++) {
                set.add(s.substring(0, i));
            }
        }

        int ans = 0;

        // Check prefixes from arr2
        for (int num : arr2) {

            String s = Integer.toString(num);

            for (int i = 1; i <= s.length(); i++) {

                String prefix = s.substring(0, i);

                if (set.contains(prefix)) {
                    ans = Math.max(ans, i);
                }
            }
        }

        return ans;
    }
}