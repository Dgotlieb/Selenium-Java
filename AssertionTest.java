import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test
    public void test_method_1() {
        int x = 7;
        int y = 5;
        Assert.assertEquals(x,y);
    }
}
