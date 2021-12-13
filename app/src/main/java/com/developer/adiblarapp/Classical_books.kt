package com.developer.adiblarapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developer.adiblarapp.databinding.FragmentClassicalBooksBinding

class Classical_books : Fragment() {
    lateinit var binding: FragmentClassicalBooksBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClassicalBooksBinding.inflate(layoutInflater)

        return binding.root
    }
}