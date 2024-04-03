import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryValueTest {
    @Test
    public void test_1() {
        assertEquals(-1, Price.getTotalPrice(0, 12));
    }

    @Test
    public void test_2() {
        assertEquals(260000, Price.getTotalPrice(1, 12));
    }

    @Test
    public void test_3() {
        assertEquals(47794000, Price.getTotalPrice(5000, 12));
    }

    @Test
    public void test_4() {
        assertEquals(47784500, Price.getTotalPrice(4999, 12));
    }

    @Test
    public void test_5() { assertEquals(23804000, Price.getTotalPrice(2500, 0)); }

    @Test
    public void test_6() {
        assertEquals(23824000, Price.getTotalPrice(2500, 1));
    }

    @Test
    public void test_7() {
        assertEquals(24284000, Price.getTotalPrice(2500, 24));
    }

    @Test
    public void test_8() {
        assertEquals(24264000, Price.getTotalPrice(2500, 23));
    }

    @Test
    public void test_9() { assertEquals(24044000, Price.getTotalPrice(2500, 12));}

}
