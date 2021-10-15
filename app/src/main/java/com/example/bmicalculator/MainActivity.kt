package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonImperialCheck(view: View) {
        TODO("Make the text_height and text_weight change using res String file")
        var radioButtonImperial = radio_button_imperial.isChecked
        if (radioButtonImperial){

        }
    }
}