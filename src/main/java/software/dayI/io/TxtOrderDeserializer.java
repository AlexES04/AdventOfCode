package software.dayI.io;

import software.dayI.models.Order;

public class TxtOrderDeserializer implements OrderDeserializer {
    @Override
    public Order deserialize(String line) {
        return new Order(line.charAt(0), Integer.parseInt(line.substring(1)));
    }
    
}
