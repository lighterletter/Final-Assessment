package nyc.c4q;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaceCalculatorActivity extends FragmentActivity {

    EditText inputDistance;
    EditText inputTimeMin;
    EditText inputTimeSec;
    EditText inputPaceMin;
    EditText inputPaceSec;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pace_calculator);

        inputDistance = (EditText) findViewById(R.id.input_distance);
        inputTimeMin = (EditText) findViewById(R.id.input_time_min);
        inputTimeSec = (EditText) findViewById(R.id.input_time_sec);
        inputPaceMin = (EditText) findViewById(R.id.input_pace_min);
        inputPaceSec = (EditText) findViewById(R.id.input_pace_sec);


        buttonCalculate = (Button) findViewById(R.id.button_calculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String dist = inputDistance.getText().toString();
//                String timeM = inputTimeMin.getText().toString();
//                String timeS = inputTimeSec.getText().toString();
//                String paceM = inputPaceMin.getText().toString();
//                String paceS = inputPaceSec.getText().toString();
//
//                int distance = Integer.parseInt(inputDistance.getText().toString());
//                double time = Double.parseDouble(timeM+"."+timeS);
//                int timeMin = Integer.parseInt(inputTimeMin.getText().toString());
//                int timeSec = Integer.parseInt(inputTimeSec.getText().toString());
//                int paceMin = Integer.parseInt(inputPaceMin.getText().toString());
//                int paceSec = Integer.parseInt(inputPaceSec.getText().toString());
//
//
//
//                if (time <= 0) {
//                    paceMin = ((timeMin + (timeSec / 60)) / distance);
//
//                    String doubleAsString = Double.toString(paceMin);
//                    String beforeDec = doubleAsString.substring(0, doubleAsString.indexOf("."));
//                    inputPaceMin.setText(beforeDec);
//                    String afterDec = doubleAsString.substring(doubleAsString.indexOf(".") + 1);
//                    inputPaceSec.setText(afterDec);
//                }


            }
        });
    }
}
