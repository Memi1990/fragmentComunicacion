package com.example.fragmentcomunicacion.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentcomunicacion.R
import com.example.fragmentcomunicacion.databinding.FragmentTwoBinding


class twoFragment : Fragment() {
private var _b:FragmentTwoBinding? = null
private val b get() = _b!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("Paquete1"){
            paquete, datos -> b.tvTwo.text = datos.getString("PrimerDato")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentTwoBinding.inflate(inflater, container, false)
        return b.root

    }

}