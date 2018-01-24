package imt3673.tomme87.ntnu.no.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class A2 extends AppCompatActivity {
    static final String RESPONSE = "A2.activity.response";
    static final int REQUEST_CODE = 1002;

    EditText T2;
    EditText T3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        this.T2 = findViewById(R.id.T2);
        this.T3 = findViewById(R.id.T3);

        final Intent i = getIntent();
        this.T2.setText(generateMsg(i.getStringExtra(A1.REQUEST)));
    }

    public void B2Pressed(final View v) {
        final Intent i = new Intent(this, A3.class);
        startActivityForResult(i, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            this.T3.setText(data.getStringExtra(RESPONSE));
        }
    }

    private String generateMsg(final String name) {
        return "Hello " + name;
    }
}
