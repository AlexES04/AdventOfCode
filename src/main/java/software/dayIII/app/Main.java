package software.dayIII.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import software.dayIII.io.BankDeserializer;
import software.dayIII.io.BankLoader;
import software.dayIII.io.TextBankDeserializer;
import software.dayIII.io.TextFileBankLoader;
import software.dayIII.models.Bank;
import software.dayIII.models.JoltageCalculator;

public class Main {
    public static void main(String[] args) throws IOException {
        BankDeserializer deserializer = new TextBankDeserializer();
        File file = new File("src/test/java/dayIII/BankTest.txt");
        BankLoader loader = new TextFileBankLoader();

        List<Bank> banks = loader.load(file, deserializer);

        JoltageCalculator calculator = new JoltageCalculator();

        int count = 0;
        long largeCount = 0;
        for (int i = 0; i < banks.size(); i++) {
            count += calculator.calculate(banks.get(i), 2);
            largeCount += calculator.calculate(banks.get(i), 12);
        }
        System.out.println("\n---- First Part ----");
        System.out.println("Total joltage: " + count);

        System.out.println("\n---- Second Part ----");
        System.out.println("Total joltage: " + largeCount);
    }
    
}
