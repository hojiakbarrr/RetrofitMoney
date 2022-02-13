package com.example.retrofitmoney.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmoney.R
import com.example.retrofitmoney.screens.start.StartAdapter
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_start_.view.*

class SecondFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        recyclerView = view.rv_second
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getBezNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner,{list ->
            list.body()?.let { adapter.setList(it) }

        })

        return view

    }


}