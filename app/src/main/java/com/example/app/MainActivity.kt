package com.example.app  // Updated package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityMainBinding  // Updated import path

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up button click listeners
        binding.btnRed.setOnClickListener {
            changeImageWithAnimation(R.drawable.image1)
        }

        binding.btnGreen.setOnClickListener {
            changeImageWithAnimation(R.drawable.image2)
        }

        binding.btnBlue.setOnClickListener {
            changeImageWithAnimation(R.drawable.image3)
        }
    }

    private fun changeImageWithAnimation(imageResId: Int) {
        binding.imageView.animate()
            .alpha(0f)
            .setDuration(300)
            .withEndAction {
                binding.imageView.setImageResource(imageResId)
                binding.imageView.animate()
                    .alpha(1f)
                    .setDuration(300)
                    .start()
            }
            .start()
    }
}