package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textname = findViewById(R.id.editTextname);
        EditText textage = findViewById(R.id.editTextage);

        Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = textname.getText().toString();
                String b = textage.getText().toString();
                // to save in string for shortcut

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                ////// ^ i add a name, = new (the place i am in .this, the place i want to go .class)
                // to move from one activity to another

                intent.putExtra("name", a);
                intent.putExtra("age", b);
                // to move the info i need to the other page

                startActivity(intent);
                // to start and move to the other page

            }
        });


    }
}