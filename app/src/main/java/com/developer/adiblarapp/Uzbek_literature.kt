package com.developer.adiblarapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developer.adiblarapp.databinding.FragmentUzbekLiteratureBinding

class Uzbek_literature : Fragment() {
    lateinit var binding: FragmentUzbekLiteratureBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUzbekLiteratureBinding.inflate(layoutInflater)


        return binding.root
    }
}