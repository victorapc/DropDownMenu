package com.inux.dropdownmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liguas_auc.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(this@MainActivity, "Posição: ${position}", Toast.LENGTH_LONG).show()
            }
    }

    override fun onResume() {
        super.onResume()

        carregarSpinner()
    }

    private fun carregarSpinner(){
        //val linguas = resources.getStringArray(R.array.linguas)
        //val linguas = listOf("Inglês", "Português", "Alemão", "Espanhol")
        val lista = ArrayList<Linguas>()
        lista.add(Linguas(1, "Inglês"))
        lista.add(Linguas(2, "Português"))
        lista.add(Linguas(3, "Alemão"))
        lista.add(Linguas(4, "Espanhol"))

        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, lista)

        liguas_auc.setAdapter(arrayAdapter)
    }
}