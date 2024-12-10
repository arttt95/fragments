package com.arttt95.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.customview.R
import androidx.fragment.app.Fragment
import com.arttt95.fragments.R

class ConversasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        // Processamento da visualização

        return view
    }

}