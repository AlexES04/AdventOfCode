package software.day01.app;
import java.io.File;
import java.io.IOException;
import java.util.List;

import software.day01.io.OrderDeserializer;
import software.day01.io.TxtOrderDeserializer;
import software.day01.io.TxtOrderLoader;
import software.day01.models.Dial;
import software.day01.models.Order;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/day01/DialTest.txt");
        OrderDeserializer deserializer = new TxtOrderDeserializer();
        TxtOrderLoader loader = new TxtOrderLoader(file, deserializer);
        List<Order> orders = loader.load();

        Dial dial = new Dial(50);
        dial.execute(orders);
        System.out.println("Orientación: " + dial.getOrientation());
        System.out.println("Contador de 0: " + dial.getCount()); 

    }
}

