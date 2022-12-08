package com.example.responsi


import android.graphics.Insets.add
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataHome : ArrayList<dataHome>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.homePict)
        dataHome = ArrayList<dataHome>()
        val Pict = arrayOf(
            R.drawable.menantea,
            R.drawable.janji,
            R.drawable.jiwa,
            R.drawable.teh2,
            R.drawable.jiwa,
            R.drawable.teh2,
        )
        for(i in Pict.indices){
            dataHome.add(
                dataHome(
                    Pict[i]
                )
            )

                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = adapterHome(dataHome)
            }

    return view
    }
}