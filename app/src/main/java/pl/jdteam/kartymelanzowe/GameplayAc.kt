package pl.jdteam.kartymelanzowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.jdteam.kartymelanzowe.databinding.ActivityGameplayBinding
import pl.jdteam.kartymelanzowe.databinding.ActivityMainBinding

class GameplayAc : AppCompatActivity() {
    private lateinit var binding: ActivityGameplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.wykonane.setOnClickListener(){

        }
        binding.nieWykonane.setOnClickListener(){

        }
    }
}