/*
5 (code) All Less [10 points]
Given a lexicographical max heap of Strings s, and an integer x, write an algorithm to find all strings in
the heap whose length is less than x.
Input Format
An array representation of a heap of strings s, where s[i] will be a String and s can be empty
Constraints
• 0 ≤ |𝑠| ≤ 10!, where |𝒔| is the length of the strings array
• S[i] can be an empty String or null.
Output Format
Print the list of strings.
Sample Input
s = ["zero", " size", "nutella", "jojo", "luna", "isse", "astor", "as", "entretien", “”, "cal"]
x = 3
Sample Output
[ “as” ]
 */
import java.util.ArrayList;
import java.util.List;
public class AllLess {
    public static List<String> allLess(String[] s, int x){
        List<String> result = new ArrayList<>();
        if (s == null || s.length == 0){
            return result;
        }
        for (String str : s){
            if(str != null && str.length() < x){
                result.add(str);
            }
        }
        return result;
    }
    public static void main(String[] args){
        String[] s = {"zero", " size", "nutella", "jojo", "luna", "isse", "astor", "as", "entretien","", "cal"};
        int x = 3;

        System.out.println(allLess(s,x));
    }
}
