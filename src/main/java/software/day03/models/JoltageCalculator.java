package software.day03.models;

import java.util.Collections;
import java.util.List;

public class JoltageCalculator {
    public JoltageCalculator() {}

    public long calculate(Bank bank, int joltageLength) {
        List<Integer> joltage = bank.getJoltage();
        int numbersNeeded = joltageLength;
        int lastIndex = 0;
        long result = 0;
        for (int i = 0; i < joltageLength; i++) {
            numbersNeeded--;
            List<Integer> subList = joltage.subList(lastIndex, joltage.size()-numbersNeeded);
            double number = Collections.max(subList);
            lastIndex += subList.indexOf((int) (number))+1;
            result += number * Math.pow(10, numbersNeeded);
        }
        return result;
    }
}
