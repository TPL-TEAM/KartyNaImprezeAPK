package pl.jdteam.kartymelanzowe

import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityGameplayBinding
import kotlin.random.Random

class GameplayAc : ComponentActivity() {
    private lateinit var binding: ActivityGameplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val array: Array<String> = resources.getStringArray(R.array.pytania)
        var lista = array.toCollection(ArrayList())
        var losowe = Random.nextInt(0, lista.size-1)
        binding.karta.text = lista[losowe]

        binding.nieWykonane.setOnClickListener(){
            if(lista.isNotEmpty()){
                lista.removeAt(losowe)
                if(lista.size == 1){
                    binding.karta.text = lista[0]
                    lista.clear()

                }
                else{
                    losowe = Random.nextInt(0, lista.size-1)
                    binding.karta.text = lista[losowe]
                }
            }else{binding.karta.text = "Koniec Gry!"}

        }
    }
}
