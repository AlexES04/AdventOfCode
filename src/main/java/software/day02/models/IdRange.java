package software.day02.models;

import java.util.ArrayList;
import java.util.List;

public class IdRange {
    private final long initialNumber;
    private final long finalNumber;

    public IdRange(int initialNumber, int finalNumber) {
        this.initialNumber = initialNumber;
        this.finalNumber = finalNumber;
    }

    public IdRange(long initialNumber, long finalNumber) {
        this.initialNumber = initialNumber;
        this.finalNumber = finalNumber;
    }

    public List<Long> getNumbers() {
        List<Long> numbers = new ArrayList<>();
        for (long number = initialNumber; number <= this.finalNumber; number++) numbers.add(number);
        return numbers;
    }
}
