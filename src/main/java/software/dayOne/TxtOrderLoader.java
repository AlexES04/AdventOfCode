package software.dayOne;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class TxtOrderLoader {
    private final File file;
    private final OrderDeserializer deserializer;

    public TxtOrderLoader(File file, OrderDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    public List<Order> load() throws IOException {
        List<Order> orders = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                orders.add(deserializer.deserialize(line));
            }
        } return orders;
    }
}
