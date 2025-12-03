import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import software.dayOne.Dial;

public class DialTest {
    
    @Test
    public void givenSimpleStringOrders() {
        assertEquals(1, new Dial().execute("R1").getOrientation());
        assertEquals(88, new Dial().execute("L12").getOrientation());

        Dial dial = new Dial();
        assertEquals(50, dial.execute("R50").getOrientation());
        assertEquals(19, dial.execute("L31").getOrientation());
        assertEquals(0, dial.execute("R50").getCount());
        assertEquals(1, dial.execute("L69").getCount());
        assertEquals(2, dial.execute("L100").getCount());

    }
        
    @Test
    public void givenSomeStringOrdersForOrientation() {
        assertEquals(89, new Dial().execute("L12", "R1").getOrientation());
        assertEquals(0, new Dial().execute("R100", "L100", "L20", "L10", "R30").getOrientation());
        assertEquals(60, new Dial().execute("L200", "L30", "R330", "L840").getOrientation());

        Dial dial = new Dial();
        assertEquals(45, dial.execute("L68", "L30", "R48", "L5").getOrientation());
        assertEquals(1, dial.execute("R55").getCount());

    }

    @Test
    public void givenManyStringOrdersForOrientation() {
        Dial dial = new Dial(50);
        String orders = """
                L68
                L30
                R48
                L5
                R60
                L55
                L1
                L99
                R14
                L82
                """;
        assertEquals(32, dial.execute(orders).getOrientation());
        assertEquals(3, dial.getCount());

        String orders2 = """
                L1
                L8
                R35
                L50
                R12
                R34
                L25
                R37
                L29
                L16
                """;
        assertEquals(89, new Dial().execute(orders2).getOrientation());
    }



 
}
