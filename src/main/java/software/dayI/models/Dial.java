package software.dayI.models;
import java.util.Arrays;
import java.util.List;

   public class Dial {
        private int orientation;
        private int count;

        public Dial() {
            this.orientation = 0;
            this.count = 0;
        }

        public Dial(int initialOrientation) {
            this.orientation = initialOrientation;
            this.count = 0;
        }

        public Dial execute(String... orders) {
            Arrays.stream(orders).forEach(order -> {
                deserialize(order);
            });
            return this;
        }

        public Dial execute(String orders) {
            String[] listOfOrders = orders.split("\n");
            Arrays.stream(listOfOrders).forEach(order -> {
                deserialize(order);
            });
            return this;
        }

        public Dial execute(List<Order> orders) {
            orders.stream().forEach(order -> moveDial(order.direction(), order.movements()));
            return this;
        }

        private int deserialize(String order) {
            char direction = order.charAt(0);
            int movements = Integer.parseInt(order.substring(1)); 
            return moveDial(direction, movements);
        }

        private int moveDial(char direction, int movements) {
            this.orientation += direction == 'L' ? - movements : movements ;

            this.orientation = this.orientation < 0 ? ((this.orientation % 100) + 100) % 100 : (this.orientation % 100);
            if (pointsAtZero()) this.count += 1;
            return this.orientation;
        }

        private boolean pointsAtZero() {
            return this.orientation == 0;
        }

        public int getOrientation() {
            return Math.abs(this.orientation);
        }

        public int getCount() {
            return this.count;
        }

    }
