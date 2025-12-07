package software.day03.models;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private final List<Integer> joltage;

    public Bank(List<Integer> joltage) {
        this.joltage = joltage;
    }

    public Bank(String joltage) {
        this.joltage = deserialize(joltage);
    }
        
    private List<Integer> deserialize(String joltage) {
        return Arrays.stream(joltage.split("")).map(Integer::parseInt).collect(Collectors.toList());
    }
    
    public List<Integer> getJoltage() {return this.joltage;}
}
