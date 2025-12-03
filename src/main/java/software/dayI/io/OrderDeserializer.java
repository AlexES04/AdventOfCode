package software.dayI.io;

import software.dayI.models.Order;

public interface OrderDeserializer {
    Order deserialize(String line);
}
