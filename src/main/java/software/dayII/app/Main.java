package software.dayII.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import software.dayII.io.RangeDeserializer;
import software.dayII.io.RangeLoader;
import software.dayII.io.TxtRangeDeserializer;
import software.dayII.io.TxtRangeLoader;
import software.dayII.models.IdRange;
import software.dayII.models.RangeValidator;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/dayII/RangeTest.txt");
        RangeDeserializer deserializer = new TxtRangeDeserializer();
        RangeLoader loader = new TxtRangeLoader(file, deserializer);

        List<IdRange> ranges = loader.load();
        
        RangeValidator validator = new RangeValidator();

        System.out.println("Contador: " + validator.execute(ranges));
    }
}
