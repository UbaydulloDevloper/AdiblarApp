package com.developer.adiblarapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developer.adiblarapp.databinding.FragmentSaveAuthorsBinding
import models.SearchCLick

class Save_authors(val b: SearchCLick) : Fragment(), SearchCLick by b {
    lateinit var binding: FragmentSaveAuthorsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSaveAuthorsBinding.inflate(layoutInflater)

        return binding.root
    }
}