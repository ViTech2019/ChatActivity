package com.vlgames.chatactivity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewListAdapter extends ArrayAdapter<String> {
    private final Activity context;



    public ViewListAdapter(Context applicationContext, ArrayList userList, Activity context) {
        super(context, R.layout.single_view);
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_view, null, true);
        TextView roomName = (TextView) rowView.findViewById(R.id.silgle_tv1);
        TextView userName = (TextView) rowView.findViewById(R.id.silgle_tv2);
        TextView messageBady = (TextView) rowView.findViewById(R.id.silgle_tv3);
        roomName.setText("");
        userName.setText("");
        messageBady.setText("");
        return rowView;
    }
}