import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class DialTest {
    
    @Test
    public void givenSimpleStringOrders() {
        assertEquals(1, new Dial().execute("R1").getOrientation());
        assertEquals(12, new Dial().execute("L12").getOrientation());

        Dial dial = new Dial();
        assertEquals(50, dial.execute("R50").getOrientation());
        assertEquals(19, dial.execute("L31").getOrientation());
        assertEquals(0, dial.execute("R50").getCount());
        assertEquals(1, dial.execute("L69").getCount());
        assertEquals(2, dial.execute("L100").getCount());

    }
        
    @Test
    public void givenSomeStringOrdersForOrientation() {
        assertEquals(11, new Dial().execute("L12", "R1").getOrientation());
        assertEquals(0, new Dial().execute("R100", "L100", "L20", "L10", "R30").getOrientation());
        assertEquals(55, new Dial().execute("L68", "L30", "R48", "L5").getOrientation());

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
    }



    public class Dial {
        private int orientation;
        private int count;

        public Dial() {
            this.orientation = 0;
            this.count = 0;
        }

        public Dial(int orientation) {
            this.orientation = orientation;
            this.count = 0;
        }

        public Dial execute(String... orders) {
            Arrays.stream(orders).forEach(order -> {
                this.orientation += deserialize(order);
                if (this.orientation == 0) this.count += 1;
            });
            return this;
        }

        public Dial execute(String orders) {
            String[] listOfOrders = orders.split("\n");
            Arrays.stream(listOfOrders).forEach(order -> {
                this.orientation += deserialize(order);
                if (this.orientation == 0) this.count += 1;
            });
            return this;
        }

        public int deserialize(String order) {
            char direction = order.charAt(0);
            int movements = Integer.parseInt(order.substring(1)); 
            return moveDial(direction, movements);
        }

        public int moveDial(char direction, int movements) {
            this.orientation = direction == 'L'? -movements % 100 : movements % 100;
            return this.orientation;
        }

        public int getOrientation() {
            return Math.abs(this.orientation);
        }

        public int getCount() {
            return this.count;
        }

    }
}
