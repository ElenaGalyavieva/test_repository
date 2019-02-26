import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int a=this.getClassNumber();
        if (a>45)
        {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}