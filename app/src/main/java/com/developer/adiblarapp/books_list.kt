package com.developer.adiblarapp

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.developer.adiblarapp.databinding.FragmentBooksListBinding
import models.SearchCLick

class books_list : Fragment(), SearchCLick {
    lateinit var binding: FragmentBooksListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBooksListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun searchOpen() {
        TODO("Not yet implemented")
    }

    override fun searchClose() {
        TODO("Not yet implemented")
    }


}