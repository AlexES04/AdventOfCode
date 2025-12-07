package software.day02.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import software.day02.io.RangeDeserializer;
import software.day02.io.RangeLoader;
import software.day02.io.TxtRangeDeserializer;
import software.day02.io.TxtRangeLoader;
import software.day02.models.IdRange;
import software.day02.models.RangeValidator;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/day02/RangeTest.txt");
        RangeDeserializer deserializer = new TxtRangeDeserializer();
        RangeLoader loader = new TxtRangeLoader(file, deserializer);

        List<IdRange> ranges = loader.load();
        
        RangeValidator validator = new RangeValidator();

        System.out.println("Contador: " + validator.execute(ranges));
    }
}
