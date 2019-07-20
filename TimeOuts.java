import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;


public class TimeOuts {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(60);

    @Test(timeout = 3000)
    public void test_method_1() {
        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }
    }
}
