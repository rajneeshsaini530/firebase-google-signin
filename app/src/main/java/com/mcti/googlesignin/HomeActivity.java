package com.mcti.googlesignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView name,uid,email,photo,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        name = findViewById(R.id.name);
        name.setText(intent.getStringExtra("name"));
        mobile = findViewById(R.id.mobile);
        mobile.setText(intent.getStringExtra("mobile"));
        email = findViewById(R.id.email);
        email.setText(intent.getStringExtra("email"));
        uid = findViewById(R.id.uid);
        uid.setText(intent.getStringExtra("uid"));
        photo = findViewById(R.id.photourl);
        photo.setText(intent.getStringExtra("imageUrl"));
    }
}
