package com.example.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplaySignUpInfo extends AppCompatActivity {
     String firstName,secondName,yourEmail,yourPassword, phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sign_up_info);


        Bundle b1=getIntent().getExtras();
        firstName=b1.getString("firstName");
        secondName=b1.getString("secondName");
        yourEmail=b1.getString("yourEmail");
        yourPassword=b1.getString("yourPassword");
        phoneNumber=b1.getString("phoneNumber");

        ArrayList<Info> infosSignUp=new ArrayList<Info>();

        infosSignUp.add(new Info("first Name:\n"+firstName,"second Name:\n"+secondName,
                "your Email:\n"+yourEmail,"your Password:\n"+yourPassword,"Phone Number:\n"+phoneNumber));



        InfoSignUpAdapter item=new InfoSignUpAdapter(this,infosSignUp);

        ListView listVew=(ListView)findViewById(R.id.List1);
        listVew.setAdapter(item);
    }
}
