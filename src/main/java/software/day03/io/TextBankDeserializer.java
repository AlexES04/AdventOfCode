package software.day03.io;

import software.day03.models.Bank;

public class TextBankDeserializer implements BankDeserializer {

    @Override
    public Bank deserialize(String joltage) {
        return new Bank(joltage);
    }
}
