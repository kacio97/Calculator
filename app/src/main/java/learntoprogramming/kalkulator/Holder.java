package learntoprogramming.kalkulator;

import java.util.ArrayList;
import java.util.List;

public class Holder {
    List<Double> values;
    List<Character> operations;

    public Holder(List<Double> values, List<Character> operations) {
        this.values = values;
        this.operations = operations;
    }

    public List<Double> getValues() {
        return values;
    }

    public List<Character> getOperations() {
        return operations;
    }
}
