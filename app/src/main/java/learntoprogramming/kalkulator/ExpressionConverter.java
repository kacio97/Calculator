package learntoprogramming.kalkulator;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ExpressionConverter {
    private static final String TAG = "ExpressionConverter";
    /**
     * Accumulate data to List<>
     *
     * @param expression Our String input
     */
    public Holder getDataFromExpression(String expression) {
        Log.d(TAG, "getDataFromExpression: STARTS");
        StringBuilder tmp = new StringBuilder();

        List<Double> values = new ArrayList<>();
        List<Character> operations = new ArrayList<>();

        double var1;
        double tmp2 = 0;

        for (int i = 0; i < expression.length(); i++) {
            char sign = expression.charAt(i);
            //jezeli 1 znakiem jest +, -, /, * to pomin
            if (sign == '+' ||
                    sign == '-' ||
                    sign == '*' ||
                    sign == '/') {
                Log.d(TAG, "getDataFromExpression: Incorrect sign");
                if (i == 0)
                    continue;

            }

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

        //zabezpieczenie gdy chcemy ustawic jako 1 wartosc ujemna
        if (expression.charAt(0) == '-') {
            values.set(0, values.get(0) * (-1));
        }
        Log.d(TAG, "getDataFromExpression: ENDS");
        return new Holder(values, operations);
    }
}
