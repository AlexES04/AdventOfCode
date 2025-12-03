package software.dayI.io;
import java.io.IOException;
import java.util.List;

import software.dayI.models.Order;

public interface OrderLoader {
    List<Order> load() throws IOException;
}
