package com.example.atividadebonus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var teste = findViewById(R.id.action_bar) as ActionBar
        var btn1 = findViewById(R.id.btn1) as Button
        var btn2 = findViewById(R.id.btn2) as Button
        var btn3 = findViewById(R.id.btn3) as Button
        var btn4 = findViewById(R.id.btn4) as Button
        var btn5 = findViewById(R.id.btn5) as Button
        var btn6 = findViewById(R.id.btn6) as Button
        var btn7 = findViewById(R.id.btn7) as Button
        var btn8 = findViewById(R.id.btn8) as Button
        var btn9 = findViewById(R.id.btn9) as Button
        Toast.makeText(
            getApplicationContext(), "O Jogador X pode realizar sua primeira jogada",
            Toast.LENGTH_SHORT
        ).show();

        btn1.setOnClickListener(){

        }
        btn2.setOnClickListener(){

        }
        btn3.setOnClickListener(){

        }
        btn4.setOnClickListener(){

        }
        btn5.setOnClickListener(){

        }
        btn6.setOnClickListener(){

        }
        btn7.setOnClickListener(){

        }
        btn8.setOnClickListener(){

        }
        btn9.setOnClickListener(){

        }

    }
}
