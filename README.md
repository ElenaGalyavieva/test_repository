# test Repository
MainClass.java
import org.junit.Test;

public class MainClass {

public int getLocalNumber()
{
return 14;
}
}


MainClassTest.java
import org.junit.Test;

public class MainClassTest extends MainClass{

@Test
public void testGetLocalNumber()
{
int a=this.getLocalNumber();

if (a==14) {
System.out.println("True");
} else {
System.out.println("False");
}
}

}
