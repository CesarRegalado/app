package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityMainBinding  // This will now resolve

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        binding.app.animate()
            .alpha(0f)
            .setDuration(300)
            .withEndAction {
                binding.app.setImageResource(imageResId)
                binding.app.animate()
                    .alpha(1f)
                    .setDuration(300)
                    .start()
            }
            .start()
    }
}