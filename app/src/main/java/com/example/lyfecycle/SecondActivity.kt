package com.example.lyfecycle

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    private lateinit var textView:TextView
    private lateinit var imageViewIV:ImageView
    private lateinit var textOutputTV:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        imageViewIV = findViewById(R.id.imageViewIV)
        textOutputTV = findViewById(R.id.textOutputTV)

        val result = intent.getStringExtra("Key")
        textView.text = "Ваш ИМТ равен $result"
        when (result.toString()) {
            in "18".."25" -> {
                textOutputTV.text = y
                imageViewIV.setImageResource(R.drawable.normal)
            }
            in "0".."17.9" -> {
                textOutputTV.text = x
                imageViewIV.setImageResource(R.drawable.small)
            }
            in "25".."80" -> {
                textOutputTV.text = z
                imageViewIV.setImageResource(R.drawable.big)
            }
            else -> textOutputTV.text = "Ошибка в расчетах"
        }
    }
}