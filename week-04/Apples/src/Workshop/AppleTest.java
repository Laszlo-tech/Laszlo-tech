package Workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppleTest {

  @Test
  public void testApple() {
    Apple alma = new Apple("apple");
    String expected = "apple";
    String actual = alma.getApple();
    assertEquals(expected, actual);
  }
  @Test
  public void testNull(){
    Apple abc = new Apple(null);
    assertEquals(null,abc.getApple());
  }
}
