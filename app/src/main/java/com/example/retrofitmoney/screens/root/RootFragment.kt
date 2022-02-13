package com.example.retrofitmoney.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.retrofitmoney.R
import com.example.retrofitmoney.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*

class RootFragment : Fragment() {

    private var ctx : Context ?=null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.tab_layout.tabIconTint = null
        view.view_pager.adapter = ViewPagerAdapter(ctx as FragmentActivity)

        TabLayoutMediator(view.tab_layout,view.view_pager){
            tab, pos ->
            when (pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_money)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_monet)
                }
            }
        }.attach()

        return view
    }

}