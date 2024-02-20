package pl.jdteam.kartymelanzowe

import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityGameplayBinding
import kotlin.random.Random


class GameplayAc : ComponentActivity() {
    private lateinit var binding: ActivityGameplayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("DZIKIE_KARTY") == true){

        }

        val array: Array<String> = resources.getStringArray(R.array.pytania)
        val lista = array.toCollection(ArrayList())
        var losowe = Random.nextInt(0, lista.size-1)

        val array1: Array<String> = resources.getStringArray(R.array.wyzwania)
        val lista1 = array1.toCollection(ArrayList())
        var losowe1 = 1
        var check = 0

        val animation1 = AnimationUtils.loadAnimation(this, R.anim.zwieksz)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.zmniejsz)

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

        binding.karta.setOnClickListener {
            if (lista1.isNotEmpty()) {
                if (lista1[losowe1] != binding.karta.text) {
                    binding.karta.startAnimation(animation1)
                    animation1.setAnimationListener(object : Animation.AnimationListener {
                        override fun onAnimationStart(animation: Animation?) {}

                        override fun onAnimationEnd(animation: Animation?) {


                            if (check == 1) {
                                lista1.removeAt(losowe1)
                            }

                            if (lista1.size == 1) {
                                binding.karta.text = lista1[0]
                                lista1.clear()
                                binding.karta.startAnimation(animation2)

                            } else {
                                losowe1 = Random.nextInt(0, lista1.size - 1)
                                binding.karta.text = lista1[losowe1]
                                check = 1
                                binding.karta.startAnimation(animation2)

                                // Rozpocznij animację2 po zakończeniu animacji1

                            }
                        }

                        override fun onAnimationRepeat(animation: Animation?) {}

                    })
                }
            } else {
                binding.karta.text = "Koniec Gry!"
            }
        }



    }

}
