package imt3673.tomme87.ntnu.no.lab1;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class A1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    static final String REQUEST = "A1.activity.request";
    static final String SPINNER_POS = "A1.spinner.position";

    EditText T1;
    Spinner L1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        this.T1 = findViewById(R.id.T1);

        this.L1 = findViewById(R.id.L1);
        this.L1.setOnItemSelectedListener(this);
        this.L1.setSelection(PreferenceManager.getDefaultSharedPreferences(this).getInt(SPINNER_POS, 0));
    }

    public void B1Pressed(final View v) {
        final Intent i = new Intent(this, A2.class);

        i.putExtra(REQUEST, T1.getText().toString());

        startActivity(i);
    }

    // https://stackoverflow.com/questions/20151414/how-can-i-use-onitemselected-in-android
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt(SPINNER_POS, pos).apply();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        /* Nothing to do */
    }
}
