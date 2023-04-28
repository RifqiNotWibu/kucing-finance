package com.example.kupengfinance.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kupengfinance.R;

public class SignInActivity extends AppCompatActivity {
    Button sign;
    TextView gosignup;
    ImageView backfsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        sign = (Button) findViewById(R.id.btnsign);
        gosignup = (TextView) findViewById(R.id.gosignup);
        backfsignin = (ImageView) findViewById(R.id.backfsignin);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });
        backfsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignInActivity.this, PreviewLoginActivity.class);
                startActivity(loginIntent);
            }
        });
        gosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignInActivity.this, RegisterActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}