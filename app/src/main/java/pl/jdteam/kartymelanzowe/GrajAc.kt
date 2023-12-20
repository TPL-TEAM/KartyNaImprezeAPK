package pl.jdteam.kartymelanzowe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.jdteam.kartymelanzowe.databinding.ActivityGrajBinding

class GrajAc : AppCompatActivity() {
    private lateinit var binding: ActivityGrajBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGrajBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kat1.setOnClickListener(){
            val przelacz_graj = Intent(applicationContext, GrajAc::class.java)
            startActivity(przelacz_graj)
        }
        binding.kat1.setOnClickListener(){

        }
        binding.kat2.setOnClickListener(){

        }
        binding.kat3.setOnClickListener(){

        }
    }
}