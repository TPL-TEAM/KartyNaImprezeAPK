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
            var kategoria1check = binding.kat1.isChecked
            var kategoria2check = binding.kat2.isChecked
            var kategoria3check = binding.kat3.isChecked
            var kategoria4check = binding.kat4.isChecked

            val start_gra = Intent(applicationContext, GameplayAc::class.java)
            start_gra.putExtra("KATEGORIA1CHECK", kategoria1check)
            start_gra.putExtra("KATEGORIA2CHECK", kategoria2check)
            start_gra.putExtra("KATEGORIA3CHECK", kategoria3check)
            start_gra.putExtra("KATEGORIA4CHECK", kategoria4check)

            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat2.setOnClickListener(){
            var kategoria1check = binding.kat1.isChecked
            var kategoria2check = binding.kat2.isChecked
            var kategoria3check = binding.kat3.isChecked
            var kategoria4check = binding.kat4.isChecked

            val start_gra = Intent(applicationContext, GameplayAc::class.java)
            start_gra.putExtra("KATEGORIA1CHECK", kategoria1check)
            start_gra.putExtra("KATEGORIA2CHECK", kategoria2check)
            start_gra.putExtra("KATEGORIA3CHECK", kategoria3check)
            start_gra.putExtra("KATEGORIA4CHECK", kategoria4check)

            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat3.setOnClickListener(){
            var kategoria1check = binding.kat1.isChecked
            var kategoria2check = binding.kat2.isChecked
            var kategoria3check = binding.kat3.isChecked
            var kategoria4check = binding.kat4.isChecked

            val start_gra = Intent(applicationContext, GameplayAc::class.java)
            start_gra.putExtra("KATEGORIA1CHECK", kategoria1check)
            start_gra.putExtra("KATEGORIA2CHECK", kategoria2check)
            start_gra.putExtra("KATEGORIA3CHECK", kategoria3check)
            start_gra.putExtra("KATEGORIA4CHECK", kategoria4check)

            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.kat4.setOnClickListener(){
            var kategoria1check = binding.kat1.isChecked
            var kategoria2check = binding.kat2.isChecked
            var kategoria3check = binding.kat3.isChecked
            var kategoria4check = binding.kat4.isChecked

            val start_gra = Intent(applicationContext, GameplayAc::class.java)
            start_gra.putExtra("KATEGORIA1CHECK", kategoria1check)
            start_gra.putExtra("KATEGORIA2CHECK", kategoria2check)
            start_gra.putExtra("KATEGORIA3CHECK", kategoria3check)
            start_gra.putExtra("KATEGORIA4CHECK", kategoria4check)

            val przelacz_gameplay = Intent(applicationContext, GraczeAc::class.java)
            startActivity(przelacz_gameplay)
        }
        binding.ustawienia.setOnClickListener(){
            val przelacz_ustawienia = Intent(applicationContext, UstawieniaAc::class.java)
            startActivity(przelacz_ustawienia)
        }
    }
}