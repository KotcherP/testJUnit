import org.junit.Assert;
import org.junit.Test;

public class TestCalculator2 {
    @Test
    public void testAdd2() throws Exception{
        int result = Calculator.add(3, 4);
        Assert.assertEquals(7,result);
    }
}
