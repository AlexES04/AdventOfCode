package dayIII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import software.dayIII.models.Bank;
import software.dayIII.models.JoltageCalculator;

public class BankTest {
    JoltageCalculator calculator = new JoltageCalculator();

    @Test
    public void givenStringJoltage() {

        assertEquals(53, calculator.calculate(new Bank("12353"), 2));
        assertEquals(98, calculator.calculate(new Bank("987654321111111"), 2));
        assertEquals(89, calculator.calculate(new Bank("811111111111119"), 2));
    }


    @Test
    public void givenListJoltage() {
        assertEquals(89, calculator.calculate(new Bank(java.util.Arrays.asList(8,1,1,1,1,1,1,1,1,1,1,1,1,9)), 2));
        assertEquals(78, calculator.calculate(new Bank(java.util.Arrays.asList(2,3,4,2,3,4,2,3,4,2,3,4,2,7,8)), 2));
        assertEquals(92, calculator.calculate(new Bank(java.util.Arrays.asList(8,1,8,1,8,1,9,1,1,1,2,1,1,1)), 2));
    }

    @Test
    public void givenStringJoltageSecondPart() {
        assertEquals(987654321111L, calculator.calculate(new Bank("987654321111111"), 12));
        assertEquals(811111111119L, calculator.calculate(new Bank("811111111111119"), 12));
        assertEquals(434234234278L, calculator.calculate(new Bank("234234234234278"), 12));
        assertEquals(888911112111L, calculator.calculate(new Bank("818181911112111"), 12));
    }

    

}



