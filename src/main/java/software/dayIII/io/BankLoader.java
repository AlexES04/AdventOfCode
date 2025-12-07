package software.dayIII.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import software.dayIII.models.Bank;

public interface BankLoader {
    public List<Bank> load(File file, BankDeserializer deserializer) throws IOException;

}
