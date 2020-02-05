package com.vlgames.chatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public static FirebaseDatabase dataBase;
    public static DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataBase = FirebaseDatabase.getInstance();
        ref = dataBase.getReference();

        setContentView(R.layout.activity_main);


        Button chatActivity = findViewById(R.id.chat_activity);
        chatActivity.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, ChatActivity.class));
                    }
                }
        );
    }


}
