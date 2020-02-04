package com.vlgames.chatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chatActivity = findViewById(R.id.chat_activity);
        chatActivity.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChatActivity.class));
                                            }
                                        }
        );
    }


}
