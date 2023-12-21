package pl.jdteam.kartymelanzowe


import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityGameplayBinding


class GameplayAc : ComponentActivity() {
    private lateinit var binding: ActivityGameplayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameplayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.nieWykonane.setOnClickListener(){

        }
    }
}