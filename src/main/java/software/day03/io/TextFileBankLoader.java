package software.day03.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import software.day03.models.Bank;

public class TextFileBankLoader implements BankLoader {
    @Override
    public List<Bank> load(File file, BankDeserializer deserializer) throws IOException {
        List<Bank> banks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                banks.add(deserializer.deserialize(line));
            }
        } return banks;
    }
    
}
