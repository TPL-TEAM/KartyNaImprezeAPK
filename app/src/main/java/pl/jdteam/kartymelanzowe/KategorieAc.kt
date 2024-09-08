package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityKategorieBinding

class KategorieAc : ComponentActivity() {
    private lateinit var binding: ActivityKategorieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKategorieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kat1.setOnClickListener(){
            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat2.setOnClickListener(){
            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat3.setOnClickListener(){

        }
        binding.ustawienia.setOnClickListener(){
            val przelacz_ustawienia = Intent(applicationContext, UstawieniaAc::class.java)
            startActivity(przelacz_ustawienia)
        }
    }
}