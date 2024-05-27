package com.example.tp3_mascotas_simulacro.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tp3_mascotas_simulacro.splashscreen.fragments.ss_fragment1
import com.example.tp3_mascotas_simulacro.splashscreen.fragments.ss_fragment2
import com.example.tp3_mascotas_simulacro.splashscreen.fragments.ss_fragment3

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ss_fragment1()
            1 -> ss_fragment2()
            2 -> ss_fragment3()
            else -> ss_fragment1()
        }
    }
}