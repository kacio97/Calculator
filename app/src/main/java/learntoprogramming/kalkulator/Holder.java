package learntoprogramming.kalkulator;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Holder {
    private static final String TAG = "Holder";
    List<Double> values;
    List<Character> operations;

    public Holder(List<Double> values, List<Character> operations) {
        this.values = values;
        this.operations = operations;
        Log.d(TAG, "Holder: Call Constructor with values and operations " + getValues() + " " + getOperations());
    }

    public List<Double> getValues() {
        return values;
    }

    public List<Character> getOperations() {
        return operations;
    }
}
