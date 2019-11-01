
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button sub=(Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);

        final EditText no1 = (EditText) findViewById(R.id.No1);
        final EditText no2 = (EditText) findViewById(R.id.No2);
        final EditText r = (EditText) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Double a=Double.parseDouble(no1.getText().toString());
                Double b=Double.parseDouble(no2.getText().toString());
                Double sum=a+b;
                r.setText(Double.toString(sum));
            }
        });
        add.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Double a=Double.parseDouble(no1.getText().toString());
                Double b=Double.parseDouble(no2.getText().toString());
                Double sum=a+b;
                r.setText(Double.toString(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Double a=Double.parseDouble(no1.getText().toString());
                Double b=Double.parseDouble(no2.getText().toString());
                Double sum=a-b;
                r.setText(Double.toString(sum));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Double a=Double.parseDouble(no1.getText().toString());
                Double b=Double.parseDouble(no2.getText().toString());
                Double sum=a*b;
                r.setText(Double.toString(sum));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Double a=Double.parseDouble(no1.getText().toString());
                Double b=Double.parseDouble(no2.getText().toString());
                Double sum=a/b;
                r.setText(Double.toString(sum));
            }
        });

    }
}
