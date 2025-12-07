package software.day01.io;
import java.io.IOException;
import java.util.List;

import software.day01.models.Order;

public interface OrderLoader {
    List<Order> load() throws IOException;
}
