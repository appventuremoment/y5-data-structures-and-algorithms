/*
Our goal is to write a boolean method that will take two char arrays and return whether they are anagrams.
Here, n is defined as the number of characters in the string (i.e. length of the string/array).

Your Task:
a)    Develop a Brute Force algorithm as described below.
We can simply generate a list of all possible strings using the characters from s1 and then see if s2 occurs.
What is the time complexity of such an algorithm? Explain your answer clearly.
b)    Develop an O(n2) algorithm to solve the problem.
loop through entire string nested and see if it equals
c)     Develop an O(n log n) algorithm to solve the problem.
sort both and compare
d)    Develop an O(n) algorithm to solve the problem.
make a hashmap

You are required to:
- code out each of the algorithm above, in addition to discussing the idea (i.e. how it works).
- Complete your code in a java file named Tut1Q2.java.
- Name each method m1(), m2(), m3() and m4() respectively.
*/
import java.util.*;

public class Lab1Qn2 {
//    For this we want to generate all permutations of one string and see if the other string is within the list of permutations
//    Therefore the time complexity should be O(n!) since by math, there are n! different permutations of string length n
//    (Without accounting for repeated characters)
//    TODO: finish this maybe
    public static boolean m1(String s1, String s2) {
        return s1 == s2;
    }

//    For this we want to iterate through each character of s1 and check if s2 contains it, making sure the character in s2
//    is not one we have counted from before. This means we have to delete from s2 everytime we match a character.
//    The time complexity of looping through each character is O(n), and each iteration of the loop, we are checking if
//    s2 contains the character in that specific iteration, which takes O(n) time, therefore the time complexity
//    of this implementation is O(n ^ 2)
    public static boolean m2(String s1, String s2) {
        for (char c : s1.toCharArray()) {
            if (s2.contains(String.valueOf(c))) {
                s2 = s2.substring(0, s2.indexOf(String.valueOf(c))) + s2.substring(s2.indexOf(String.valueOf(c)) + 1);
//                System.out.println(s2); testing if I still remember how substring works (I do)
            } else {
                return false;
            }
        }
//        This part only works if you have strings of equal length, which is assumed here
//        If you are checking if s2 is a substring AND a permutation of s1 you need to check if s2 is empty before returning true
        return true;
    }

//    We sort s1 and s2 by their ASCII code (so alphabetical order) and compare if they are equal
//    Since we are assuming the sorting method to be optimal, the sorting is the longest operation
//    and has a time complexity of O(n log n)
    public static boolean m3(String s1, String s2) {
        char[] SortedS1 = s1.toCharArray();
        char[] SortedS2 = s2.toCharArray();
        Arrays.sort(SortedS1);
        Arrays.sort(SortedS2);
        return new String(SortedS1).equals(new String(SortedS2));
    }

//    We convert the strings into a hashmap of characters and their frequencies in each string and comparing if they are equal
//    Since we are basically looping through each string to count their frequencies, the time complexity of this is O(n)
    public static boolean m4(String s1, String s2) {
        Map<Character, Integer> s1Freq = new HashMap<>();
        Map<Character, Integer> s2Freq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Freq.put(c, s1Freq.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            s2Freq.put(c, s2Freq.getOrDefault(c, 0) + 1);
        }
        return s1Freq.equals(s2Freq);
    }

    public static void main(String[] args) {
        System.out.println(m4("teeshirt", "teashirt"));
    }
}

class AllPermutations {
    public static void main(String[] args) {
        String s = "tee"; // Example string
        permutation(s);
        }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}