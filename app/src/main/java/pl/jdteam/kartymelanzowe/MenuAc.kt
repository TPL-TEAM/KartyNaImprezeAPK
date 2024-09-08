package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityMenuBinding

class MenuAc : ComponentActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
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