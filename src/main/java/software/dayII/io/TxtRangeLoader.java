package software.dayII.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import software.dayII.models.IdRange;

public class TxtRangeLoader implements RangeLoader {
    private final File file;
    private final RangeDeserializer deserializer;

    public TxtRangeLoader(File file, RangeDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    
    @Override
    public List<IdRange> load() throws IOException {
        List<IdRange> ranges = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                ranges = deserializer.deserialize(line);
            }
        } return ranges;
    }
    
}
