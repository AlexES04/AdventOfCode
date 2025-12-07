package software.day03.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import software.day03.models.Bank;

public interface BankLoader {
    public List<Bank> load(File file, BankDeserializer deserializer) throws IOException;

}
