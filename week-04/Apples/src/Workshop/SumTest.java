package Workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
  Sum sum ;
  ArrayList<Integer> emptyList = new ArrayList<>(Arrays.asList());
  ArrayList<Integer> myList;
  ArrayList<Integer> arrayWithOne;

  @BeforeEach
  public void each() {
    myList = new  ArrayList<>(Arrays.asList(10, 20, 40, 11));
    sum = new Sum();
    arrayWithOne = new ArrayList<>(Arrays.asList(10));
  }

  @Test
  public void testSum() {
    assertEquals(81, sum.sumOfElements(myList));
  }

  @Test
  public void testEmpty() {
    int expected = 0;
    int actual = sum.sumOfElements(emptyList);
    assertEquals(expected,actual);
  }
  @Test
  public void testOne(){
   int expected = 10;
   int actual = sum.sumOfElements(arrayWithOne);
   assertEquals(expected,actual);

  }
  @Test
  public void testNull(){
   assertThrows(IllegalArgumentException.class,()->sum.sumOfElements(null));
  }
}
