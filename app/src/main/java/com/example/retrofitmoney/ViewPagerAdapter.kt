package com.example.retrofitmoney

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.retrofitmoney.screens.second.SecondFragment
import com.example.retrofitmoney.screens.start.Start_Fragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Start_Fragment()
            else -> SecondFragment()
        }

    }
}