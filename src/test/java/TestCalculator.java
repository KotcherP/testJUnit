import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd() throws Exception{
        int result = Calculator.add(3, 4);
        Assert.assertEquals(7,result);
    }
}
