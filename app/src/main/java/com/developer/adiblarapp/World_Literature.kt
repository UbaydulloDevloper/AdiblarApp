package com.developer.adiblarapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developer.adiblarapp.databinding.FragmentWorldLiteratureBinding


class World_Literature : Fragment() {
    lateinit var binding: FragmentWorldLiteratureBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWorldLiteratureBinding.inflate(layoutInflater)


        return binding.root
    }
}