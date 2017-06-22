package com.codepath.twitterlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogIn(View v) {
        Toast.makeText(getApplicationContext(), "Logging in...", Toast.LENGTH_SHORT).show();
    }

    public void onCancel(View v) {
        Toast.makeText(getApplicationContext(), "Cancelling...", Toast.LENGTH_SHORT).show();
    }
}
