package com.mirea.kuznetsovavalentina.button_try;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private Button buttonOK;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.tvOut);
        buttonOK = findViewById(R.id.btnOK);
        buttonCancel = findViewById(R.id.btnCancel);
        View.OnClickListener oclBtnOK = v -> myTextView.setText("Нажата кнопка ОК");
        View.OnClickListener oclBtnCancel = v -> myTextView.setText("Нажата кнопка Отмена");
        buttonOK.setOnClickListener(oclBtnOK);
        buttonCancel.setOnClickListener(oclBtnCancel);
    }
}