package com.example.kupengfinance.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.kupengfinance.R;

public class ForgetPasswordActivity extends AppCompatActivity {

    ImageView backsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        backsignup = (ImageView) findViewById(R.id.backfsignup);

        backsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPasswordActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}