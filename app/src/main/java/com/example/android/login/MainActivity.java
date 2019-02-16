package com.example.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
     EditText result,result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void login(View view) {

                result=(EditText)findViewById(R.id.emailText);
        result1=(EditText)findViewById(R.id.password);

            Intent intent = new Intent(this, DisplayInfo.class);
            Bundle b = new Bundle();
            b.putString("email", result.getText().toString());
            b.putString("password", result1.getText().toString());

        if (result.getText().toString().equals("") || result1.getText().toString().equals("")) {
            Toast.makeText(getBaseContext(),"you must input the the email and password",Toast.LENGTH_SHORT).show();

        }

        else {
            intent.putExtras(b);
            startActivity(intent);
        }

    }

    public void  signUp(View view) {

        Intent intent = new Intent(this, SignUp.class);
       startActivity(intent);
    }
}
