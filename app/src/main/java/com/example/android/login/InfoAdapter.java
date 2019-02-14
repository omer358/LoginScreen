package com.example.android.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info>
{
    public InfoAdapter(Context context, ArrayList<Info> infos) {
        super(context, 0,infos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        View LitItem=convertView;
        if (LitItem == null) {
            LitItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Info currentWord = getItem(position);


        TextView emailTextView = (TextView) LitItem.findViewById(R.id.em);
        emailTextView.setText(currentWord.getEmailInfo());


        TextView passwordTextView = (TextView) LitItem.findViewById(R.id.pas);
        passwordTextView.setText(currentWord.getPasswordInfo());
        return LitItem;
    }

}
