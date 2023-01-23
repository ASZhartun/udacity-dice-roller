package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        binding.mainText.text = resources.getText(R.string.hello_binding_diceRoller)

        binding.button.setOnClickListener {  roll() }
    }

    private fun roll() {
        when (Random().nextInt(6) + 1) {
            1 -> binding.imageView.setImageResource(R.drawable.dice_1)
            2 -> binding.imageView.setImageResource(R.drawable.dice_2)
            3 -> binding.imageView.setImageResource(R.drawable.dice_3)
            4 -> binding.imageView.setImageResource(R.drawable.dice_4)
            5 -> binding.imageView.setImageResource(R.drawable.dice_5)
            6 -> binding.imageView.setImageResource(R.drawable.dice_6)
        }
    }
}