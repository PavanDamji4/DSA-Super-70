/* Question 1 - Given a strings consisting of words separated by spaces,
return true if any word appears more than once, and false otherwise.
A word is defined as a sequence of non-space characters. The comparison should be case-sensitive.

 Example 1:
Input: s = "hello world hello"
Output: true
Explanation: The word "hello" appears twice.

 Example 2:
Input: s = "I love LeetCode platform"
Output: false
Explanation: All words are unique.
*/

import java.util.*;

public class Duplicate_Word_Checker_01 {

    boolean solve(String s)
    {
        String[] words = s.split(" ");   //taking every word in a array from single string
        HashSet <String> hs = new HashSet<>(); // using HashSet cause it does not allow duplicate value
        for (int i=0;i<words.length;i++)
        {
            if ((hs.contains(words[i].toLowerCase()))){  //Checking if the word already exists in HashSet
                return true;
            }
            hs.add(words[i]);  // automatically ignores this line...if the element already exist in HashSetk
        }
        return false;
    }

    public static void main(String[] args) {

        Duplicate_Word_Checker_01 q = new Duplicate_Word_Checker_01();
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter String : ");
        String str = sc.nextLine();         // Taking input
        System.out.println("Does this String has Duplicate Words? : " +q.solve(str)); //Final Finish of result

    }
}
