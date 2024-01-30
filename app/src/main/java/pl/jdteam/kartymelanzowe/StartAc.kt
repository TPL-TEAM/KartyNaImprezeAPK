package pl.jdteam.kartymelanzowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityUzytkownicyBinding

class StartAc : ComponentActivity() {
    private lateinit var binding: ActivityUzytkownicyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUzytkownicyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}