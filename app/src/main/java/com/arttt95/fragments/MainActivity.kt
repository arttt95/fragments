package com.arttt95.fragments

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.arttt95.fragments.fragments.ChamadasFragment
import com.arttt95.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i("ciclo_vida", "Activity onCreate")

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*val fragmentManager = supportFragmentManager.beginTransaction()

        // Diversas alterações em fragments
        val conversasFragment = ConversasFragment()
        fragmentManager.add( R.id.fragment_conteudo, conversasFragment )

        fragmentManager.commit()*/

        val conversasFragment = ConversasFragment()
        val chamadasFragment = ChamadasFragment()


        btnConversas.setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, conversasFragment)
                .commit()

        }


        btnChamadas.setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, chamadasFragment)
//                .remove(conversasFragment)
                .commit()

        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Activity onStop")
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "Activity onDestroy")
        super.onDestroy()
    }
}