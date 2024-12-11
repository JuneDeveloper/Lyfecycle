package com.example.lyfecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editTextHeightET:EditText
    private lateinit var editTextWeightET:EditText
    private lateinit var buttonCalcBTN:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextHeightET = findViewById(R.id.editTextHeightET)
        editTextWeightET = findViewById(R.id.editTextWeightET)
        buttonCalcBTN = findViewById(R.id.buttonCalcBTN)

        buttonCalcBTN.setOnClickListener(this)
    }

    override fun onClick(v:View) {
        val h = (Integer.parseInt(editTextHeightET.text.toString())).toDouble()/100
        val w = Integer.parseInt(editTextWeightET.text.toString()).toDouble()
        val imt:Double = w/(h * h)
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("Key",imt.toString())
        startActivity(intent)
    }
}