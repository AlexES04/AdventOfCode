package software;
import software.dayOne.Dial;
import software.dayOne.Order;
import software.dayOne.OrderDeserializer;
import software.dayOne.TxtOrderDeserializer;
import software.dayOne.TxtOrderLoader;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/DialTest.txt");
        OrderDeserializer deserializer = new TxtOrderDeserializer();
        TxtOrderLoader loader = new TxtOrderLoader(file, deserializer);
        List<Order> orders = loader.load();

        Dial dial = new Dial(50);
        dial.execute(orders);
        System.out.println("Orientación: " + dial.getOrientation());
        System.out.println("Contador de 0: " + dial.getCount()); 

    }
}

