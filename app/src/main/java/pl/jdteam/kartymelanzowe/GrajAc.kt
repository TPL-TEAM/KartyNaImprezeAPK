package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityGrajBinding

class GrajAc : ComponentActivity() {
    private lateinit var binding: ActivityGrajBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrajBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kat1.setOnClickListener(){
            val przelacz_graj = Intent(applicationContext, GameplayAc::class.java)
            startActivity(przelacz_graj)
        }

        binding.kat2.setOnClickListener(){

        }
        binding.kat3.setOnClickListener(){

        }
    }
}