package pl.jdteam.kartymelanzowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.jdteam.kartymelanzowe.databinding.ActivityMainBinding

class GameplayAc : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}