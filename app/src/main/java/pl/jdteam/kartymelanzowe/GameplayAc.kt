package pl.jdteam.kartymelanzowe

import android.content.Intent
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



        val ogolne: Array<String> = resources.getStringArray(R.array.ogolne)
        val pytania: Array<String> = resources.getStringArray(R.array.pytaniaa)
        var pytania_lista = pytania.toCollection(ArrayList())

        if(intent.getBooleanExtra("DZIKIE_KARTY", false) == true){
            val dzikie_karty: Array<String> = resources.getStringArray(R.array.dzikie_karty)
            var dzikie_karty_lista = dzikie_karty.toCollection(ArrayList())
            pytania_lista.addAll(dzikie_karty_lista)
        }

        var losowe = Random.nextInt(0, pytania_lista.size-1)

        val wyzwania: Array<String> = resources.getStringArray(R.array.wyzwania)
        val wyzwania_lista = wyzwania.toCollection(ArrayList())
        var losowe1 = 1
        var check = 0

        val animation1 = AnimationUtils.loadAnimation(this, R.anim.zwieksz)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.zmniejsz)

        binding.karta.text = pytania_lista[losowe]
        binding.nieWykonane.setOnClickListener(){
            if(pytania_lista.isNotEmpty()){
                pytania_lista.removeAt(losowe)
                if(pytania_lista.size == 1){
                    binding.karta.text = pytania_lista[0]
                    pytania_lista.clear()

                }
                else{
                    losowe = Random.nextInt(0, pytania_lista.size-1)
                    binding.karta.text = pytania_lista[losowe]
                }
            }else{binding.karta.text = "Koniec Gry!"}
        }

        binding.karta.setOnClickListener {
            if (intent.getBooleanExtra("REVERSE",false == true)){
                if (wyzwania_lista.isNotEmpty()) {
                    if (wyzwania_lista[losowe1] != binding.karta.text) {
                        binding.karta.startAnimation(animation1)
                        animation1.setAnimationListener(object : Animation.AnimationListener {
                            override fun onAnimationStart(animation: Animation?) {}

                            override fun onAnimationEnd(animation: Animation?) {
                                if (check == 1) {
                                    wyzwania_lista.removeAt(losowe1)
                                }

                                if (wyzwania_lista.size == 1) {
                                    binding.karta.startAnimation(animation2)
                                    binding.karta.text = wyzwania_lista[0]
                                    wyzwania_lista.clear()

                                } else {
                                    losowe1 = Random.nextInt(0, wyzwania_lista.size - 1)
                                    binding.karta.startAnimation(animation2)
                                    binding.karta.text = wyzwania_lista[losowe1]
                                    check = 1
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

        binding.ustawienia.setOnClickListener(){
            val przelacz_ustawienia = Intent(applicationContext, UstawieniaAc::class.java)
            startActivity(przelacz_ustawienia)
        }

    }

}
