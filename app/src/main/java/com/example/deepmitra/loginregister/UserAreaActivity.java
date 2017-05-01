package com.example.deepmitra.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        TextView tvWelcome = (TextView) findViewById(R.id.tvWelcome);
        Button bt_kol = (Button) findViewById(R.id.bt_kol);
        Button bt_mum = (Button) findViewById(R.id.bt_mum);
        Button bt_del = (Button) findViewById(R.id.bt_del);
        Button bt_review = (Button) findViewById(R.id.bt_review);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        String message = name + ", Welcome to your profile";
        tvWelcome.setText(message);

        bt_kol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, ListView_Kol.class);
                UserAreaActivity.this.startActivity(intent);
            }
        });

        bt_mum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, ListView_Mum.class);
                UserAreaActivity.this.startActivity(intent);
            }
        });

        bt_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, ListView_Del.class);
                UserAreaActivity.this.startActivity(intent);
            }
        });
    }
}
