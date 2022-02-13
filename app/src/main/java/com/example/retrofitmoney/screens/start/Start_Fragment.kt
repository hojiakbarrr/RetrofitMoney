package com.example.retrofitmoney.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmoney.R
import kotlinx.android.synthetic.main.fragment_start_.view.*

class Start_Fragment : Fragment() {

     lateinit var recyclerView: RecyclerView
     lateinit var adapter: StartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var viewModel = ViewModelProvider(this).get(StartViewModel::class.java)

        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_start_, container, false)
        recyclerView = v.rv_start
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner,{list ->
            list.body()?.let { adapter.setList(it) }

        })


        return v

//*/*/*/*/*/*//*/*///*/*/*/план как работать с ретрофитом для чайников

//        1. добавить плагины (setting -> plugins) json to kotlin , apply
//        2.   implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
//             //Retrofit and okhttp3 Client
//             implementation 'com.squareup.retrofit2:retrofit:2.9.0'
//             implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
//             implementation "com.squareup.okhttp3:okhttp:4.5.0"
//             implementation "com.squareup.okhttp3:logging-interceptor:4.5.0"
//
//             implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2'
//             implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2'
//             implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"


//        1. добавить плагины     id 'kotlin-android-extensions' в gradle(это обращение в xml под тип bindinga)

//        1. создаем папку модель там есть данные то есть параметры
//        1. создаем папку data там есть ретрофит и api service
//        1. создаем папку


    }

}