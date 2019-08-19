package learntoprogramming.kalkulator;

import java.util.List;

public class CarryOutEquations extends ExpressionConverter {

    private ExpressionConverter expressionConverter;
    private String expression;

    public CarryOutEquations(String expression) {
        this.expression = expression;
        expressionConverter = new ExpressionConverter();
    }

    public Double convert() {

        Holder holder = expressionConverter.getDataFromExpression(expression);
        char currentSign;

        //LABEL FOR LOOP
        for (int j = 0; j < holder.operations.size(); j++) {
            currentSign = holder.operations.get(j);

            if (currentSign == '/') {
                j = carryOutDivide(j, holder.values, holder.operations);
            } else if (currentSign == '*') {
                j = carryOutMultiply(j, holder.values, holder.operations);
            }
        }

        for (int j = 0; j < holder.operations.size(); j++) {
            currentSign = holder.operations.get(j);

            if (currentSign == '+') {
                j = carryOutAdding(j, holder.values, holder.operations);
            } else if (currentSign == '-') {
                j = carryOutSubtract(j, holder.values, holder.operations);
            }
        }

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
        operations.remove(index);
        values.set(index, (values.get(index) - values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
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
        operations.remove(index);
        values.set(index, (values.get(index) + values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
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
        operations.remove(index);
        values.set(index, (values.get(index) * values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
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
        operations.remove(index);
        values.set(index, (values.get(index) / values.get(index + 1)));
        values.remove(index + 1);
        index -= 1;
        return index;
    }
}
