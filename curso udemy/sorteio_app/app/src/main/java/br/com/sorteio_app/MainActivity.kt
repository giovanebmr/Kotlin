//referencias:
// https://developer.android.com/topic/libraries/view-binding#usage

package br.com.sorteio_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.sorteio_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }



    fun cliqueBotao(view : View){
        var numero = Random.nextInt(11)
        binding.textoInfo.text = "$numero"
    }


}