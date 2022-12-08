package com.example.responsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Promo : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataPromo : ArrayList<dataPromo>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_promo, container, false)

        recyclerView = view.findViewById(R.id.recyPromo)
        dataPromo = ArrayList<dataPromo>()
        val Pict = arrayOf(
            R.drawable.model_1,
            R.drawable.model_1,
            R.drawable.model_1,
            R.drawable.model_1,
            R.drawable.model_1,
            R.drawable.model_1,
        )
        val promo = arrayOf(
            "CARRY OUTER BROWN",
            "CARRY OUTER BROWN",
            "CARRY OUTER BROWN",
            "CARRY OUTER BROWN",
            "CARRY OUTER BROWN",
            "CARRY OUTER BROWN"

        )
        for(i in Pict.indices){
            dataPromo.add(
                dataPromo(
                    Pict[i],
                    promo[i],
                )
            )

            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = adapterPromo(dataPromo)
        }
        return view
    }
}