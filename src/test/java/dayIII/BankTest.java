package dayIII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankTest {
    @Test
    public void first() {
        assertEquals(53, new Bank("12353"));
        assertEquals(98, new Bank("987654321111111"));
        assertEquals(89, new Bank("811111111111119"));
        assertEquals(78, new Bank("234234234234278"));
        assertEquals(92, new Bank("818181911112111"));
    }

    

}



