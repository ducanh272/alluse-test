import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecisionTableTest {
    @Test
    public void test_1() {
        assertEquals(-1, Price.getTotalPrice(-1, -1));
    }

    @Test
    public void test_2() {
        assertEquals(-1, Price.getTotalPrice(0.9, -1));
    }

    @Test
    public void test_3() {
        assertEquals(-1, Price.getTotalPrice(15, -1));
    }

    @Test
    public void test_4() {
        assertEquals(-1, Price.getTotalPrice(36, -1));
    }

    @Test
    public void test_5() { assertEquals(-1, Price.getTotalPrice(5100, -1)); }

    @Test
    public void test_6() {
        assertEquals(-1, Price.getTotalPrice(-1, 2));
    }

    @Test
    public void test_7() {
        assertEquals(49000, Price.getTotalPrice(0.9, 2));
    }

    @Test
    public void test_8() {
        assertEquals(214000, Price.getTotalPrice(15, 2));
    }

    @Test
    public void test_9() { assertEquals(436000, Price.getTotalPrice(36, 2));}

    @Test
    public void test_10() {
        assertEquals(-1, Price.getTotalPrice(5100, 2));
    }

    @Test
    public void test_11() {
        assertEquals(-1, Price.getTotalPrice(-1, 26));
    }

    @Test
    public void test_12() {
        assertEquals(-1, Price.getTotalPrice(0.9, 26));
    }

    @Test
    public void test_13() {
        assertEquals(-1, Price.getTotalPrice(15, 26));
    }

    @Test
    public void test_14() { assertEquals(-1, Price.getTotalPrice(36, 26)); }

    @Test
    public void test_15() {
        assertEquals(-1, Price.getTotalPrice(5100, 26));
    }


}
