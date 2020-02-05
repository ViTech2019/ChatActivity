package com.vlgames.chatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    private Activity context;
    ListView simpleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String userList[] = {"", "", "", "", "", ""};


        simpleList = (ListView) findViewById(R.id.simpleListView);
        ViewListAdapter viewListAdapter = new ViewListAdapter(getApplicationContext(), userList);
        simpleList.setAdapter(viewListAdapter);


    }
}

