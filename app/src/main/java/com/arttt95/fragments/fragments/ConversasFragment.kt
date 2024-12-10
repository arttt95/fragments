package com.arttt95.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//import androidx.customview.R
import androidx.fragment.app.Fragment
import com.arttt95.fragments.R

//class ConversasFragment : Fragment(R.layout.fragment_conversas) {
class ConversasFragment : Fragment() {

    private lateinit var editNome: EditText
    private lateinit var textNome: TextView
    private lateinit var btnExecutar: Button

    private lateinit var textCategoria: TextView

    private var categoria: String? = null
    private var usuario: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment onCreate")

        categoria = arguments?.getString("categoria")
        usuario = arguments?.getString("usuario")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Log.i("ciclo_vida", "Fragment OnCreateView")

        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        // Processamento da visualização
        editNome = view.findViewById(R.id.edit_nome)
        textNome = view.findViewById(R.id.text_nome)
        btnExecutar = view.findViewById(R.id.btn_mercado)

        textCategoria = view.findViewById(R.id.text_categoria)

        textCategoria.text = categoria
        textNome.text = usuario

        btnExecutar.setOnClickListener {

            /*val nome = editNome.text.toString()
            textNome.text = nome*/

            textNome.text = editNome.text.toString()

        }

        return view
    }

    // onCreated -> Deprecated
    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("civlo_vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment onStop")
    }

    override fun onDestroyView() {
        Log.i("ciclo_vida", "Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("ciclo_vida", "Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("ciclo_vida", "Fragment onDetach")
        super.onDetach()
    }

}