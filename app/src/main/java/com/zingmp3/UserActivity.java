package com.zingmp3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UserActivity extends AppCompatActivity {
    LinearLayout ln_logout;
    ImageView btn_back;
    Dialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btn_back = (ImageView) findViewById(R.id.img_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ln_logout = (LinearLayout) findViewById(R.id.line_logout);
        ln_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showDialog();
                dialog = new Dialog(UserActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_logout);


                TextView btn_logout = dialog.findViewById(R.id.btn_logout);
                TextView btn_cancel = dialog.findViewById(R.id.btn_cancel);

                btn_logout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myIntent = new Intent(UserActivity.this , PersonalActivity.class);
                        startActivity(myIntent);
                    }
                });

                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }

    public void showDialog() {

    }
}
