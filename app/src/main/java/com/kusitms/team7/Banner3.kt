package com.kusitms.team7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.findNavController


class Banner3 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_banner3, container, false)

        view.findViewById<ImageButton>(R.id.three_to_one_banner_btn).setOnClickListener {
            it.findNavController().navigate(R.id.action_banner3_to_banner1)
        }
        return view
    }


}