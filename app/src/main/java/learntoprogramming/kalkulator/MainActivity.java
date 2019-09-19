package learntoprogramming.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText result;
    private EditText newNumber;
    private TextView displayOperation;
    private final String VALUE_CONTENT = "Value Content";
    private final String OPERATION_CONTENT = "Operation Content";

    //Zmienne do przechowywania operandów (liczby) oraz typu działania
    private Double operandOne = 0D;
    //    private Double operandTwo = 0D;
    private String pendingOperation = "="; //Jakiej operacji oczekujemy

    private Double negativeDouble = 0D;

    //1
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: SAVING STATE");
        outState.putString(OPERATION_CONTENT, pendingOperation);
        outState.putDouble(VALUE_CONTENT, operandOne);
    }

    //2
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    //2
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: RESTORE STATE");
        operandOne = savedInstanceState.getDouble(VALUE_CONTENT);
        pendingOperation = savedInstanceState.getString(OPERATION_CONTENT);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: STARTS");
        result = findViewById(R.id.result); // wynik
        newNumber = findViewById(R.id.newNumber); // pole gdzie wykonują się operacje (wyświetl)
        displayOperation = findViewById(R.id.operation);

        //Guziki dla liczb
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b0 = findViewById(R.id.b0);

        //Guziki wykonujące operacje
        Button buttonDot = findViewById(R.id.dot);
        Button buttonEquals = findViewById(R.id.equals);
        Button buttonPlus = findViewById(R.id.plus);
        Button buttonMinus = findViewById(R.id.minus);
        Button buttonMultiply = findViewById(R.id.multiply);
        Button buttonDivide = findViewById(R.id.divide);
        Button buttonClear = findViewById(R.id.clear);
        Button buttonNegative = findViewById(R.id.neg);

        //wyrazenie (string)
        View.OnClickListener valueClickListener = v -> {
            Button b = (Button) v;

            newNumber.append(b.getText().toString());
            Log.d(TAG, "ValueClickListener onCreate: set values" + newNumber.toString());
        };

        b0.setOnClickListener(valueClickListener);
        b1.setOnClickListener(valueClickListener);
        b2.setOnClickListener(valueClickListener);
        b3.setOnClickListener(valueClickListener);
        b4.setOnClickListener(valueClickListener);
        b5.setOnClickListener(valueClickListener);
        b6.setOnClickListener(valueClickListener);
        b7.setOnClickListener(valueClickListener);
        b8.setOnClickListener(valueClickListener);
        b9.setOnClickListener(valueClickListener);
        buttonDot.setOnClickListener(valueClickListener);
        buttonDivide.setOnClickListener(valueClickListener);
        buttonMinus.setOnClickListener(valueClickListener);
        buttonPlus.setOnClickListener(valueClickListener);
        buttonMultiply.setOnClickListener(valueClickListener);

        //wyczysc pola
        buttonClear.setOnClickListener(v -> {
            newNumber.setText("");
            result.setText("");
            operandOne = 0D;
            Log.d(TAG, "Clear onCreate: Clearing all setup");
//            operandTwo = 0D;
        });

        //negacja
        View.OnClickListener negClickListener = v -> {
            String expression;

            expression = newNumber.getText().toString();
            try {
                negativeDouble = Double.valueOf(expression) * (-1);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            newNumber.setText(negativeDouble.toString());
            negativeDouble = 0D;
            Log.d(TAG, "negClickListener onCreate: Neg value is " + newNumber.toString());

        };

        buttonNegative.setOnClickListener(negClickListener);


        //znak '=' wykonaj dzialania
        View.OnClickListener operationListener = v -> {
            Button b = (Button) v;
            String operation = b.getText().toString();
            String expression = newNumber.getText().toString();

            pendingOperation = operation;
            displayOperation.setText(pendingOperation);
            Log.d(TAG, "Express onCreate: Processing data " + expression);

            if (!(expression.equals(""))) {
                CarryOutEquations c = new CarryOutEquations(expression);

                c.convert();
                result.setText(c.convert().toString());

            } else {
                Toast.makeText(this, "Wyrażenie nie może być puste", Toast.LENGTH_LONG).show();
            }


            /*
            try {
                Double doubleValue = Double.valueOf(value);
                performOperation(doubleValue, operation);
            } catch (NumberFormatException e) {
                newNumber.setText("");
            }*/

            if (result.equals("-0.0") || result.equals("-0")) {
                double tempNeg;
                tempNeg = Double.valueOf(String.valueOf(result.getText())) * (-1);
                result.setText(Double.toString(tempNeg));
            }
            newNumber.setText("");

            // move down if err
        };

        buttonEquals.setOnClickListener(operationListener);
    }

/*
    private void performOperation(Double value, String operation) {
        //jezeli wartosc1 jest pusta to przypisz do niej 'value' (Dziala tylko na poczatku potem nadpisujemy tylko value2)
        if (operandOne == null) {
            operandOne = value;
        } else {

            if (pendingOperation.equals("=")) {
                pendingOperation = operation;
            }


            //Jezeli 'pendingOperation' ma wartosc domyslna '=' wowczas przypisz do niej parametr Operation

            switch (pendingOperation) {
                case "=":
                    operandOne = value;
                    break;

                case "+":
                    operandOne += value;
                    break;

                case "-":
                    operandOne -= value;
                    break;

                case "*":
                    operandOne *= value;
                    break;

                case "/":
                    if (value == 0) {
                        operandOne = 0.0;
                    } else
                        operandOne /= value;
                    break;


            }
        }

    }*/

}
