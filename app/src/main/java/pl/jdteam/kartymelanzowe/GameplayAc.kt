package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
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



        val pytania = ArrayList<String>()
        val wyzwania = ArrayList<String>()


        if(intent.getBooleanExtra("DZIKIE_KARTY", false) == true){
            val dzikie_karty: Array<String> = resources.getStringArray(R.array.dzikie_karty)
            val pytania_lista = dzikie_karty.toCollection(ArrayList())
            pytania.addAll(pytania_lista)
        }

        if(intent.getBooleanExtra("KATEGORIA1CHECK", false) == true){
            val pytania_ogolne: Array<String> = resources.getStringArray(R.array.pytania_ogolne)
            val pytania_lista = pytania_ogolne.toCollection(ArrayList())
            pytania.addAll(pytania_lista)

            val wyzwania_ogolne: Array<String> = resources.getStringArray(R.array.wyzwania_ogolne)
            val wyzwania_lista = wyzwania_ogolne.toCollection(ArrayList())
            wyzwania.addAll(wyzwania_lista)
        }

        if(intent.getBooleanExtra("KATEGORIA2CHECK", false) == true){
            val pytania_sport: Array<String> = resources.getStringArray(R.array.pytania_sport)
            val pytania_lista = pytania_sport.toCollection(ArrayList())
            pytania.addAll(pytania_lista)

            val wyzwania_sport: Array<String> = resources.getStringArray(R.array.wyzwania_sport)
            val wyzwania_lista = wyzwania_sport.toCollection(ArrayList())
            wyzwania.addAll(wyzwania_lista)
        }

        if(intent.getBooleanExtra("KATEGORIA3CHECK", false) == true){
            val pytania_plus18: Array<String> = resources.getStringArray(R.array.pytania_plus18)
            val pytania_lista = pytania_plus18.toCollection(ArrayList())
            pytania.addAll(pytania_lista)

            val wyzwania_plus18: Array<String> = resources.getStringArray(R.array.wyzwania_plus18)
            val wyzwania_lista = wyzwania_plus18.toCollection(ArrayList())
            wyzwania.addAll(wyzwania_lista)
        }

        if(intent.getBooleanExtra("KATEGORIA4CHECK", false) == true){
            val pytania_rodzinne: Array<String> = resources.getStringArray(R.array.pytania_rodzinne)
            val pytania_lista = pytania_rodzinne.toCollection(ArrayList())
            pytania.addAll(pytania_lista)

            val wyzwania_rodzinne: Array<String> = resources.getStringArray(R.array.wyzwania_rodzinne)
            val wyzwania_lista = wyzwania_rodzinne.toCollection(ArrayList())
            wyzwania.addAll(wyzwania_lista)
        }

        var losowe = Random.nextInt(0, pytania.size-1)
        var losowe1 = 1
        var check = 0

        val animation1 = AnimationUtils.loadAnimation(this, R.anim.zwieksz)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.zmniejsz)

        binding.karta.text = pytania[losowe]
        binding.nieWykonane.setOnClickListener(){
            if(pytania.isNotEmpty()){
                pytania.removeAt(losowe)
                if(pytania.size == 1){
                    binding.karta.text = pytania[0]
                    pytania.clear()

                }
                else{
                    losowe = Random.nextInt(0, pytania.size-1)
                    binding.karta.text = pytania[losowe]
                }
            }else{binding.karta.text = "Koniec Gry!"}
        }

        binding.karta.setOnClickListener {
            if (intent.getBooleanExtra("REVERSE",false) == true){
                if (wyzwania.isNotEmpty()) {
                    if (wyzwania[losowe1] != binding.karta.text) {
                        binding.karta.startAnimation(animation1)
                        animation1.setAnimationListener(object : Animation.AnimationListener {
                            override fun onAnimationStart(animation: Animation?) {}

                            override fun onAnimationEnd(animation: Animation?) {
                                if (check == 1) {
                                    wyzwania.removeAt(losowe1)
                                }

                                if (wyzwania.size == 1) {
                                    binding.karta.startAnimation(animation2)
                                    binding.karta.text = wyzwania[0]
                                    wyzwania.clear()

                                } else {
                                    losowe1 = Random.nextInt(0, wyzwania.size - 1)
                                    binding.karta.startAnimation(animation2)
                                    binding.karta.text = wyzwania[losowe1]
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
