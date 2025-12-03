package software.dayII.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import software.dayII.models.IdRange;

public class TxtRangeDeserializer implements RangeDeserializer {
    private List<IdRange> ranges = new ArrayList<>();

    @Override
    public List<IdRange> deserialize(String input) {
        String[] ranges = input.split(",");
        Arrays.stream(ranges).forEach(range -> this.ranges.add(normalize(range)));
        return this.ranges;
    }
    
    public IdRange normalize(String range) {
        return new IdRange(toLong(range.split("-")[0]), toLong(range.split("-")[1]));
    }

    public int toInt(String number) {
        return Integer.parseInt(number);
    }

    public long toLong(String number) {
        return Long.parseLong(number);
    }
}
