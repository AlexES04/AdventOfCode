package dayIII;

import java.util.ArrayList;
import java.util.List;

public class Bank {
        private final List<Integer> joltage;
        private int count;

        public Bank(List<Integer> joltage) {
            this.joltage = joltage;
            this.count = 0;
        }

        public Bank(String joltage) {
            this.joltage = deserialize(joltage);
        }
        
        private List<Integer> deserialize(String joltage) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(0);
            return numbers;
        }
}
