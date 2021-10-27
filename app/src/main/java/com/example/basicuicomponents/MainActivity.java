package com.example.basicuicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private ImageButton imgButton;
    private ToggleButton toggleButton;
    private Switch switch1;
    private CheckBox chkBox1;
    private CheckBox chkBox2;
    private RadioGroup rGroup;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        imgButton = findViewById(R.id.imageButton);
        toggleButton = findViewById(R.id.toggleButton);
        switch1 = findViewById(R.id.switch1);
        chkBox1 = findViewById(R.id.checkBox1);
        chkBox2 = findViewById(R.id.checkBox2);
        rGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable ed = editText.getText();
                Toast.makeText(getApplicationContext(), ed, Toast.LENGTH_LONG).show();
            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });
    }

    public void buttonClickH(View v){

    }

    @Override
    protected void onStart() {
        super.onStart();
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    // Put some meat on the sandwich
                }
            else {
                    // Remove the meat
                    break;
                }
            case R.id.checkBox2:
                if (checked) {
                    // Cheese me
                }
            else {
                    // I'm lactose intolerant
                    break;
                }
        }
    }

    public void checkBox1Clicked(View v){
        boolean checked = ((CheckBox)v).isChecked();
        if(checked){

        }else{

        }
    }

    public void checkBox2Clicked(View v){
        boolean checked = ((CheckBox)v).isChecked();
        if(checked){

        }else{

        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked) {
                    // Pirates are the best
                    break;
                }
            case R.id.radioButton2:
                if (checked) {
                    // Ninjas rule
                    break;
                }
        }
    }
}