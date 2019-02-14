package com.example.android.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoSignUpAdapter extends ArrayAdapter<Info>
{
    public InfoSignUpAdapter(Context context, ArrayList<Info> infosS) {
        super(context, 0,infosS);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View LitItem1=convertView;
        if (LitItem1 == null) {
            LitItem1 = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, parent, false);
        }
        Info currentWord = getItem(position);


        TextView firstName = (TextView) LitItem1.findViewById(R.id.fName);
        firstName.setText(currentWord.getfName());


        TextView secondName = (TextView) LitItem1.findViewById(R.id.sName);
        secondName.setText(currentWord.getsName());

        TextView yourEmail = (TextView) LitItem1.findViewById(R.id.uEmail);
        yourEmail.setText(currentWord.getuEmail());

        TextView yourPassword = (TextView) LitItem1.findViewById(R.id.uPassword);
        yourPassword.setText(currentWord.getuPassword());

        TextView phoneNumber = (TextView) LitItem1.findViewById(R.id.P_Number);
        phoneNumber.setText(currentWord.getPhoneNumber());


         return LitItem1;
    }


}


