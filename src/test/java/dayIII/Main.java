package dayIII;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8); numbers.add(1); numbers.add(1); numbers.add(1); numbers.add(9);
        Bank bank = new Bank(numbers);
        JoltageCalculator calculator = new JoltageCalculator();

        System.out.println(calculator.calculate(numbers));

    }
    
}
