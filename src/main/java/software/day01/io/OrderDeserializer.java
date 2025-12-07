package software.day01.io;

import software.day01.models.Order;

public interface OrderDeserializer {
    Order deserialize(String line);
}
