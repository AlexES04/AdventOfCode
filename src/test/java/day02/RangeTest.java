package day02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import software.day02.io.RangeDeserializer;
import software.day02.io.RangeLoader;
import software.day02.io.TxtRangeDeserializer;
import software.day02.io.TxtRangeLoader;
import software.day02.models.IdRange;
import software.day02.models.RangeValidator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RangeTest {
    
    @Test
    public void givenSimpleIdRange() {
        assertEquals(1, new RangeValidator().execute(new IdRange(10, 21)));
        assertEquals(3, new RangeValidator().execute(new IdRange(33, 55)));
        assertEquals(9, new RangeValidator().execute(new IdRange(1, 100)));
        assertEquals(1, new RangeValidator().execute(new IdRange(1009, 1100)));
    }

    @Test
    public void givenIdRangeList() {
        List<IdRange> ranges = new ArrayList<>();
        ranges.add(new IdRange(10, 21));
        ranges.add(new IdRange(1, 100));
        ranges.add(new IdRange(800, 1020));

        assertEquals(11, new RangeValidator().execute(ranges));
    }

    @Test
    public void givenFilePathToDeserialize() throws IOException {
        File file = new File("src/main/java/software/dayII/test.txt");
        RangeDeserializer deserializer = new TxtRangeDeserializer();
        RangeLoader loader = new TxtRangeLoader(file, deserializer);

        List<IdRange> ranges = loader.load();

        assertEquals(7, new RangeValidator().execute(ranges));
    }
}
