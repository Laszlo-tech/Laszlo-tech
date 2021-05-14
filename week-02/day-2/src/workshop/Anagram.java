package workshop;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String a = "dog";
    String b = "god";
    System.out.println(isAnagram(a, b));
  }

  public static boolean isAnagram(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }
    char[] ch1 = new char[word1.length()];
    char[] ch2 = new char[word1.length()];
    for (int i = 0; i < word1.length(); i++) {
      ch1[i] = word1.charAt(i);
      ch2[i] = word2.charAt(i);
    }
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < ch1.length; i++) {
      if (ch1[i] != ch2[i]) {
        return false;
      }
    }
    return true;
  }
}
