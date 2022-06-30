package com.example.fragmentcomunicacion.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import com.example.fragmentcomunicacion.R
import com.example.fragmentcomunicacion.databinding.FragmentOneBinding

class oneFragment : Fragment() {
    private var _b:FragmentOneBinding? = null
    private val b get() = _b!!
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentOneBinding.inflate(inflater, container, false)
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.tvOne.setOnClickListener {
            count++
            b.tvOne.text = count.toString()
            setFragmentResult("Paquete1", bundleOf("PrimerDato" to b.tvOne.text))
        }
    }

}