package imt3673.tomme87.ntnu.no.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A3 extends AppCompatActivity {

    EditText T4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

        this.T4 = findViewById(R.id.T4);
    }

    /**
     * When B3 button pressed
     * Set a result for this activity and finish.
     *
     * @param v
     */
    public void B3Pressed(final View v) {
        final Intent intent = new Intent();
        final Bundle bundle = new Bundle();

        bundle.putString(A2.RESPONSE, this.T4.getText().toString());
        intent.putExtras(bundle);
        this.setResult(RESULT_OK, intent);

        finish();
    }
}
