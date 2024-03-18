package com.example.worldskillsbank;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2, btn3, btn4;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        context = MainActivity.this;
        btn4.setOnClickListener(this::onClick);
    }

    public void onClick(View v)
    {
        CustonDialog dialog = new CustonDialog(this);
        Window window = dialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.width = 300; // Ширина на весь экран
        params.height = 160;
        window.setAttributes(params);
        dialog.show();
    }
}