package com.vlgames.chatactivity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewListAdapter extends BaseAdapter {

    Context context;
    String userList[];
    LayoutInflater inflater;



    public ViewListAdapter(Context applicationContext, String[] userList) {
        this.userList = userList;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return userList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View rowView, ViewGroup parent) {

        rowView = inflater.inflate(R.layout.single_view, null);
        TextView roomName = rowView.findViewById(R.id.silgle_tv1);
        TextView userName = rowView.findViewById(R.id.silgle_tv2);
        TextView messageBady = rowView.findViewById(R.id.silgle_tv3);
        roomName.setText("");
        userName.setText("");
        messageBady.setText("");
        return rowView;
    }
}