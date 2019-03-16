package com.example.karl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button boton;
    private TextView text;

    private  String texto;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            normalClick();
        }
    };

    private View.OnLongClickListener clickListeneeeer = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            if(v.getId()==R.id.boton){
                longClick();
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        boton = findViewById(R.id.boton);
        boton.setOnClickListener(clickListener);
        boton.setOnLongClickListener(clickListeneeeer);

        text = findViewById(R.id.text);

        normalClick();

    }

    private void  normalClick(){
        texto = username.getText().toString();
        if(texto!=""){
            text.setText(texto);
        }
        else{
            text.setText("");
        }

    }

    private void longClick(){
        texto = password.getText().toString();
        if(texto!=""){
            text.setText(texto);
        }

    }
}