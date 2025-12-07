package software.day02.models;

import java.util.List;

public class RangeValidator {
    private long count;

    public RangeValidator() {
        this.count = 0;
    }

    public long execute(IdRange range) {
        range.getNumbers().stream().forEach(number -> {
            if (!isValidId(number)) this.count+=number;});
        return this.count;
    }

    public long execute(List<IdRange> ranges) {
        ranges.stream().forEach(range -> range.getNumbers().stream().forEach(number -> 
            {if(!isValidId(number)) this.count += number;
            
        }
        ));
        return this.count;
    }

    public boolean isValidId(long number) {
        int digitsNumber = String.valueOf(number).length();
        if (digitsNumber % 2 != 0) return true;

        int divisionIndex = (int) Math.pow(10, digitsNumber/2);
        return (number / divisionIndex) != (number % divisionIndex);
    }

}
