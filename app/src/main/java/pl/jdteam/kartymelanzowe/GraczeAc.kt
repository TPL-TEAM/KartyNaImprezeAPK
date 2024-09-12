package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityGraczeBinding

class GraczeAc : ComponentActivity() {
    private lateinit var binding: ActivityGraczeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraczeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener() {
            var dzikie_karty_switch = binding.switch1.isChecked
            var reverse_switch = binding.switch2.isChecked
            val startgra = Intent(applicationContext, GameplayAc::class.java)
            startgra.putExtra("DZIKIE_KARTY", dzikie_karty_switch)
            startgra.putExtra("REVERSE", reverse_switch)
            startActivity(startgra)
        }
        binding.gracz1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (!s.isNullOrBlank()) {
                    binding.gracz2.visibility = View.VISIBLE
                } else {
                    binding.gracz2.visibility = View.GONE
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Empty implementation
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Not needed for this case
            }
        })
    }
}