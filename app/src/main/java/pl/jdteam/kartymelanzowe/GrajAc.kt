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
            val przelacz_gameplay = Intent(applicationContext, UzytkownicyAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat2.setOnClickListener(){
            val przelacz_gameplay = Intent(applicationContext, UzytkownicyAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat3.setOnClickListener(){

        }
    }
}