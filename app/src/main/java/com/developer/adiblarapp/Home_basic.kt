package com.developer.adiblarapp

import Adapters.ViewPagerAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.developer.adiblarapp.databinding.FragmentHomeBasicBinding
import com.google.android.material.tabs.TabLayoutMediator

class Home_basic : Fragment() {
    lateinit var binding: FragmentHomeBasicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBasicBinding.inflate(layoutInflater)
        var count = 0
        binding.bottomBar.setOnItemSelectedListener {
            /*  when (it) {
                  0 -> {
                      count = 0
                  }
                  1 -> {
                      count = 1
                  }
                  2 -> {
                      count = 2
                  }
              }*/
            count = it
        }

        binding.viewPager.adapter = ViewPagerAdapter(childFragmentManager, lifecycle, count)
        binding.viewPager.isUserInputEnabled = false

        return binding.root
    }
}