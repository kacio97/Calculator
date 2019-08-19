package learntoprogramming.kalkulator;

import java.util.ArrayList;
import java.util.List;

public class ExpressionConverter {

    /**
     * Accumulate data to List<>
     *
     * @param expression Our String input
     */
    public Holder getDataFromExpression(String expression) {

        StringBuilder tmp = new StringBuilder();

        List<Double> values = new ArrayList<>();
        List<Character> operations = new ArrayList<>();

        double var1;

        for (int i = 0; i < expression.length(); i++) {
            char sign = expression.charAt(i);

            switch (sign) {

                case '+': {
                    var1 = Double.parseDouble(String.valueOf(tmp));
                    values.add(var1);
                    operations.add(sign);
                    tmp = new StringBuilder();
                    continue;
                }

                case '-': {
                    var1 = Double.parseDouble(String.valueOf(tmp));
                    values.add(var1);
                    operations.add(sign);
                    tmp = new StringBuilder();
                    continue;
                }


                case '*': {
                    var1 = Double.parseDouble(String.valueOf(tmp));
                    values.add(var1);
                    operations.add(sign);
                    tmp = new StringBuilder();
                    continue;
                }


                case '/': {
                    var1 = Double.parseDouble(String.valueOf(tmp));
                    values.add(var1);
                    operations.add(sign);
                    tmp = new StringBuilder();
                    continue;
                }
            }


            tmp.append(sign);
        }

        var1 = Double.parseDouble(String.valueOf(tmp));
        values.add(var1);
        return new Holder(values, operations);
    }
}
