import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String a = this.getClassString();
        if ((a.contains("Hello"))|(a.contains("hello"))) {
            System.out.println("True");
        }
        else
        {
            Assert.fail("There is no entry in the line");
        }
    }
}