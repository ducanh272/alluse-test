
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllUseTest {
    @Test
    public void test_1() {
        assertEquals(-1, Price.getTotalPrice(-2, 2));
    }

    @Test
    public void test_2() {
        assertEquals(9000, Price.getTotalPrice(0.8, 0));
    }

    @Test
    public void test_3() {
        assertEquals(214000, Price.getTotalPrice(15, 2));
    }

    @Test
    public void test_4() {
        assertEquals(434000, Price.getTotalPrice(40, 0));
    }

    @Test
    public void test_5() {
        assertEquals(29000, Price.getTotalPrice(0.9, 1));
}
}
