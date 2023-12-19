package pl.jdteam.kartymelanzowe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.jdteam.kartymelanzowe.databinding.ActivityGrajBinding

class GrajAc : AppCompatActivity() {
    private lateinit var binding: ActivityGrajBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrajBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.action
    }
}