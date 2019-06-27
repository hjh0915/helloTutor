import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUtils {
   @Test
   public void testAdd() {	
      assertEquals(5, Utils.add(2, 3));
   }

   @Test
   public void testAdd02() {	
      assertEquals(6, Utils.add(2, 3));
   }

}
