package com.example.tikitakato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

private var firstPlayer: Boolean = true;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            symbolHandler(button1)
        }
        button2.setOnClickListener {
            symbolHandler(button2)
        }
        button3.setOnClickListener {
            symbolHandler(button3)
        }
        button4.setOnClickListener {
            symbolHandler(button4)
        }
        button5.setOnClickListener {
            symbolHandler(button5)
        }
        button6.setOnClickListener {
            symbolHandler(button6)
        }
        button7.setOnClickListener {
            symbolHandler(button7)
        }
        button8.setOnClickListener {
            symbolHandler(button8)
        }
        button9.setOnClickListener {
            symbolHandler(button9)
        }
        restartGameButton.setOnClickListener {
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""
            resultTextView.text = ""
            setButtonsClickable(true)
            firstPlayer = true
        }
    }

    fun checkWinner(){
        if(button1.text.isNotEmpty() && button1.text == button2.text && button2.text == button3.text){
            resultTextView.text = "${button1.text} Won!"
            setButtonsClickable(false)
        }else if(button4.text.isNotEmpty() && button4.text == button5.text && button5.text == button6.text){
            resultTextView.text = "${button4.text} Won!"
            setButtonsClickable(false)
        }else if(button7.text.isNotEmpty() && button7.text == button8.text && button8.text == button9.text){
            resultTextView.text = "${button7.text} Won!"
            setButtonsClickable(false)
        }else if(button1.text.isNotEmpty() && button1.text == button4.text && button4.text == button7.text){
            resultTextView.text = "${button7.text} Won!"
            setButtonsClickable(false)
        }else if(button2.text.isNotEmpty() && button2.text == button5.text && button5.text == button8.text){
            resultTextView.text = "${button8.text} Won!"
            setButtonsClickable(false)
        } else if(button3.text.isNotEmpty() && button3.text == button6.text && button6.text == button9.text){
            resultTextView.text = "${button9.text} Won!"
            setButtonsClickable(false)
        } else if(button1.text.isNotEmpty() && button1.text == button5.text && button5.text == button9.text){
            resultTextView.text = "${button9.text} Won!"
            setButtonsClickable(false)
        }else if(button3.text.isNotEmpty() && button3.text == button5.text && button5.text == button7.text){
            resultTextView.text = "${button3.text} Won!"
            setButtonsClickable(false)
        }else if(button1.text.isNotEmpty() && button2.text.isNotEmpty() && button3.text.isNotEmpty() && button4.text.isNotEmpty() && button5.text.isNotEmpty() && button6.text.isNotEmpty() && button7.text.isNotEmpty() && button8.text.isNotEmpty() && button9.text.isNotEmpty()){
            resultTextView.text = "Game Tied"
            setButtonsClickable(false)
        }

    }


    fun symbolHandler(Button: Button){
        if(firstPlayer == true){
            Button.text = "X"
            firstPlayer = false;
        } else {
            Button.text = "O"
            firstPlayer = true;
        }
        Button.isClickable = false;
        checkWinner()
    }

    fun setButtonsClickable(value: Boolean){
        button1.isClickable = value
        button2.isClickable = value
        button3.isClickable = value
        button4.isClickable = value
        button5.isClickable = value
        button6.isClickable = value
        button7.isClickable = value
        button8.isClickable = value
        button9.isClickable = value
    }

}