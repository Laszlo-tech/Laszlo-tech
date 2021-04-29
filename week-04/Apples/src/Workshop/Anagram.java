package Workshop;

import java.util.Arrays;

public class Anagram {
  private String word1;
  private String word2;

  public Anagram() {
    this.word1 = word1;
    this.word2 = word2;
  }

  public static boolean anagram(String word1, String word2) {
    boolean status = true;
    if (word1.length() != word2.length()) {
      status = false;
    } else {
      char[] word1Array = word1.toCharArray();
      char[] word2Array = word2.toCharArray();
      Arrays.sort(word1Array);
      Arrays.sort(word2Array);
      status = Arrays.equals(word1Array, word2Array);
    }
    return status;
  }
}
