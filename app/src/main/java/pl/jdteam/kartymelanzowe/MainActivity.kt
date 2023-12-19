package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.graj.setOnClickListener(){
            val przelacz_graj = Intent(applicationContext, GrajAc::class.java)
            startActivity(przelacz_graj)
        }
        binding.ustawienia.setOnClickListener(){
            val przelacz_opcje = Intent(applicationContext, UstawieniaAc::class.java)
            startActivity(przelacz_opcje)
        }
    }
}