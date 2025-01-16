package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class userChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_choice);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton imgX = findViewById(R.id.imageButton);
        ImageButton imgO=findViewById(R.id.imageButton2);
        imgX.setOnClickListener((v -> {
            Intent intent = new Intent(userChoice.this, MainActivity.class);
            intent.putExtra("activePlayer",0);
            startActivity(intent);
        }));
        imgO.setOnClickListener((v -> {
            Intent intent = new Intent(userChoice.this, MainActivity.class);
            intent.putExtra("activePlayer",1);
            startActivity(intent);
        }));

        }
    }
