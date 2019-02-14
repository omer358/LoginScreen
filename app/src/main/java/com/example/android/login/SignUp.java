package com.example.android.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText firstName,secondName,youEmail,youPassword,phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void signUpB(View view)
    {
       firstName=(EditText)findViewById(R.id.first_name);
       secondName=(EditText)findViewById(R.id.second_name);
       youEmail=(EditText)findViewById(R.id.your_Email);
       youPassword=(EditText)findViewById(R.id.your_password);
       phoneNumber=(EditText)findViewById(R.id.phone_number);

        Intent intent = new Intent(this, DisplaySignUpInfo.class);
        Bundle b1 = new Bundle();
      b1.putString("firstName", firstName.getText().toString());
      b1.putString("secondName", secondName.getText().toString());
      b1.putString("yourEmail", youEmail.getText().toString());
      b1.putString("yourPassword", youPassword.getText().toString());
      b1.putString("phoneNumber",phoneNumber.getText().toString());

        if (firstName.getText().toString().equals("") || secondName.getText().toString().equals("")||
                youEmail.getText().toString().equals("")|| youPassword.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"There fields are empty",Toast.LENGTH_SHORT).show();

        }
        else {
            intent.putExtras(b1);
            startActivity(intent);
        }

    }



}
