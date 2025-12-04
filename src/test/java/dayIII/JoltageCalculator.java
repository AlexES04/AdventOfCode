package dayIII;

import java.util.Collections;
import java.util.List;

public class JoltageCalculator {
    public int count;

    public JoltageCalculator() {
        this.count = 0;
    }


    public int calculate(List<Integer> joltage) {
        List<Integer> firstPart = joltage.subList(0, joltage.size()-1);
        int firstMax = Collections.max(firstPart);
        int index = firstPart.indexOf(firstMax);

        int secondMax = Collections.max(joltage.subList(index+1, joltage.size()));
        
        int maxJoltage = firstMax*10 + secondMax;
        this.count = maxJoltage;
        return (maxJoltage);
    }



}
