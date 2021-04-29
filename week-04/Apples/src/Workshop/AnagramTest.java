package Workshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {



  @Test
  void testDifferentWord(){

   assertEquals(true,Anagram.anagram("listen","silent"));
  }



}