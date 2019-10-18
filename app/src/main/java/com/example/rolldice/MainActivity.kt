package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener { countUp() }
    }
    private fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        val randomInt2 = Random().nextInt (6)+1
        val randomInt3 = Random().nextInt (6)+1

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = randomInt.toString()
        resultText1.text = randomInt2.toString()
        resultText2.text = randomInt3.toString()

    }

    private fun countUp(){

        Toast.makeText(this,"Count Up!",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val s1 = resultText.getText().toString()
        val s2 = resultText1.getText().toString()
        val s3 = resultText2.getText().toString()
        var dice1 = s1.toInt()
        var dice2 = s2.toInt()
        var dice3 = s3.toInt()

        dice1++
        if(dice1 <= 6)
            resultText.text = dice1.toString()

        else
            resultText.text = "6"

        dice2++
        if(dice2 <= 6)
            resultText1.text = dice2.toString()

        else
            resultText1.text = "6"

        dice3++
        if(dice3 <= 6)
            resultText2.text = dice3.toString()

        else
            resultText2.text = "6"

    }
}
