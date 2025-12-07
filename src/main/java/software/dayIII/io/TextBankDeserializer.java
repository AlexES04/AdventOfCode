package software.dayIII.io;

import software.dayIII.models.Bank;

public class TextBankDeserializer implements BankDeserializer {

    @Override
    public Bank deserialize(String joltage) {
        return new Bank(joltage);
    }
}
