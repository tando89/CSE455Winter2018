package com.example.tan089.tutorial01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2, editText3;
    private Button submit;
    private TextView textView1, textView2, textView3;

    private String fullName, email, major;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.EditText01);
        editText2 = findViewById(R.id.EditText02);
        editText3 = findViewById(R.id.EditText03);
        submit = findViewById(R.id.bnt);
        textView1 = findViewById(R.id.nameTxt);
        textView2 = findViewById(R.id.emailTxt);
        textView3 = findViewById(R.id.majorTxt);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fullName = editText1.getText().toString();
                email = editText2.getText().toString();
                major = editText3.getText().toString();
                textView1.setText("Full Name: "+fullName);
                textView2.setText("Email: "+ email);
                textView3.setText("Major: "+ major);
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");

                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        });
    }
}
