package Workshop;

public class Gnirts implements CharSequence{
  private String word;

  public Gnirts(String word) {
    this.word = word;
  }
  public String reverse(String toBeReversed){
    StringBuilder sb = new StringBuilder();
    String reversed = sb.append(toBeReversed).reverse().toString();
    return reversed;
  }




  @Override
  public char charAt(int index) {
    return reverse(word).charAt(index);
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return reverse(word).subSequence(start,end);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
