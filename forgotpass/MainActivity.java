import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button changepwd = findViewById(R.id.changepwd);
        final EditText user_text = (EditText) findViewById(R.id.oldpwd);
        final EditText pass_text = (EditText) findViewById(R.id.password);
        final EditText new_pass = (EditText) findViewById(R.id.confirmpwd);

        changepwd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                if (!pass_text.getText().toString().equals(new_pass.getText().toString())) {
                    Toast.makeText(context, "Both Passwords don't match", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(context, "Both Passwords match. Password Changed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

