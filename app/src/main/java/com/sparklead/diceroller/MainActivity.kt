package com.sparklead.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.rollbutton)
        rollbutton.setOnClickListener {

            rolldice()

        }

        diceimage = findViewById(R.id.image)

    }

    private fun rolldice() {

        val drawblesource = when (Random.nextInt(6) + 1) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6

        }
        diceimage.setImageResource(drawblesource)

    }
}