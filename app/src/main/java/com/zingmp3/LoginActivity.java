package com.zingmp3;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class LoginActivity  extends AppCompatActivity {
    Button btn_signin;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_signin = (Button) findViewById(R.id.btn_sign);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUser();
            }
        });
    }

    public void openUser(){
        Intent myIntent = new Intent(LoginActivity.this , UserActivity.class);
        startActivity(myIntent);
    }


}
