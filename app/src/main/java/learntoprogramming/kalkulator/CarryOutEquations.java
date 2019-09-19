package learntoprogramming.kalkulator;

import android.util.Log;

import java.util.List;

public class CarryOutEquations extends ExpressionConverter {
    private static final String TAG = "CarryOutEquations";
    private ExpressionConverter expressionConverter;
    private String expression;

    public CarryOutEquations(String expression) {
        Log.d(TAG, "CarryOutEquations: Call constructor");
        this.expression = expression;
        expressionConverter = new ExpressionConverter();
    }

    public Double convert() {
        Log.d(TAG, "CarryOutEquations convert: STARTS");
        Holder holder = expressionConverter.getDataFromExpression(expression);
        char currentSign;

        //LABEL FOR LOOP

        //1 stopien wykonywania dzialan
        for (int j = 0; j < holder.operations.size(); j++) {
            currentSign = holder.operations.get(j);

            if (currentSign == '/') {
                j = carryOutDivide(j, holder.values, holder.operations);
            } else if (currentSign == '*') {
                j = carryOutMultiply(j, holder.values, holder.operations);
            }
        }
        //2 stopien wykonywania dzialan
        for (int j = 0; j < holder.operations.size(); j++) {
            currentSign = holder.operations.get(j);

            if (currentSign == '+') {
                j = carryOutAdding(j, holder.values, holder.operations);
            } else if (currentSign == '-') {
                j = carryOutSubtract(j, holder.values, holder.operations);
            }
        }
        Log.d(TAG, "CarryOutEquations convert: Result is " + holder.values.get(0).toString());
        return holder.values.get(0);
    }

    /**
     * Second label to make a equation (SUBTRACT-)
     *
     * @param index      from loop
     * @param values     List of values
     * @param operations List of operands
     * @return new index for loop
     */
    private int carryOutSubtract(int index, List<Double> values, List<Character> operations) {
        Log.d(TAG, "carryOutSubtract: params " + index + " " + values.get(index) + " " + values.get(index + 1));
        operations.remove(index);
        values.set(index, (values.get(index) - values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
        Log.d(TAG, "carryOutSubtract: index " + index);
        return index;
    }

    /**
     * Second label to make a equation (ADDING+)
     *
     * @param index      from loop
     * @param values     List of values
     * @param operations List of operands
     * @return new index for loop
     */
    private int carryOutAdding(int index, List<Double> values, List<Character> operations) {
        Log.d(TAG, "carryOutSubtract: params " + index + " " + values.get(index) + " " + values.get(index + 1));
        operations.remove(index);
        values.set(index, (values.get(index) + values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
        Log.d(TAG, "carryOutSubtract: index " + index);

        return index;
    }

    /**
     * Fisrt label to make a equation (MULTIPLY*)
     *
     * @param index      from loop
     * @param values     List of values
     * @param operations List of operands
     * @return new index for loop
     */
    private int carryOutMultiply(int index, List<Double> values, List<Character> operations) {
        Log.d(TAG, "carryOutSubtract: params " + index + " " + values.get(index) + " " + values.get(index + 1));
        operations.remove(index);
        values.set(index, (values.get(index) * values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
        Log.d(TAG, "carryOutSubtract: index " + index);

        return index;
    }

    /**
     * First label to make a equation (DIVIDE/)
     *
     * @param index      from loop
     * @param values     List of values
     * @param operations List of operands
     * @return new index for loop
     */
    private int carryOutDivide(int index, List<Double> values, List<Character> operations) {
        Log.d(TAG, "carryOutSubtract: params " + index + " " + values.get(index) + " " + values.get(index + 1));
        operations.remove(index);
        values.set(index, (values.get(index) / values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
        Log.d(TAG, "carryOutSubtract: index " + index);

        return index;
    }
}
