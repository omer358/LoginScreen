package com.example.android.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayInfo extends AppCompatActivity {

    String email,password,firstName,secondName,yourEmail,yourPassword;
    int phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        Bundle b=getIntent().getExtras();
         email =b.getString("email");
         password=b.getString("password");

        final ArrayList<Info> infos=new ArrayList<Info>();

        infos.add(new Info("Email: "+email,"Password: "+password));



        InfoAdapter itemAdapter=new InfoAdapter(this,infos);

        ListView listview=(ListView)findViewById(R.id.List);
        listview.setAdapter(itemAdapter);






//        String email =b.getString("email");
//        String password=b.getString("password");
////        text.setText("email:"+email+"\n password:"+password);
   }
}
