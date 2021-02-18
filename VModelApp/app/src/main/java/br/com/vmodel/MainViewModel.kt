package br.com.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainViewModel: ViewModel() {

    var mContador = MutableLiveData<String>().apply { value = contador.toString() }

    private var contador: Int = 0

    private fun setmContador(){
        mContador.value = contador.toString()
    }

    private fun validaContador() {
        contador++
        if (contador > 5) {
            contador = 0
        }
        setmContador()
    }

    fun contador(){
        validaContador()
    }

}