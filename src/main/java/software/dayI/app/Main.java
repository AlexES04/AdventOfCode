package software.dayI.app;
import java.io.File;
import java.io.IOException;
import java.util.List;

import software.dayI.io.OrderDeserializer;
import software.dayI.io.TxtOrderDeserializer;
import software.dayI.io.TxtOrderLoader;
import software.dayI.models.Dial;
import software.dayI.models.Order;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/dayI/DialTest.txt");
        OrderDeserializer deserializer = new TxtOrderDeserializer();
        TxtOrderLoader loader = new TxtOrderLoader(file, deserializer);
        List<Order> orders = loader.load();

        Dial dial = new Dial(50);
        dial.execute(orders);
        System.out.println("Orientación: " + dial.getOrientation());
        System.out.println("Contador de 0: " + dial.getCount()); 

    }
}

