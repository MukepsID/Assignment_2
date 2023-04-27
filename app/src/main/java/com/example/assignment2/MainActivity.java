package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView counterTextView;
    private Button incrementButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle textView) {
        super.onCreate(textView);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counter);
        incrementButton = findViewById(R.id.increment_button);
        editText = findViewById(R.id.edit_text);
//      Counter button click listener
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
//        Edit text save instance
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("edit_text", editText.getText().toString());
    }

}