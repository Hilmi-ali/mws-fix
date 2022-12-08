package com.example.responsi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Setting : Fragment() {
    private lateinit var btnedit : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_setting, container, false)
        btnedit = view.findViewById(R.id.jadi)
        val activity = getActivity()

        btnedit.setOnClickListener {
            val intent = Intent(activity, editProfile::class.java)
            startActivity(intent)
        }
        return view
    }
}