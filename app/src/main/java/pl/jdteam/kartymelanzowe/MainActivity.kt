package pl.jdteam.kartymelanzowe

import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}