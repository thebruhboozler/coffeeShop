package com.example.coffeeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class finishFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_finish, container, false)

        val price = arguments?.getDouble("price")

        val orderPriceButton = view.findViewById<Button>(R.id.priceDisplay)
        orderPriceButton.text = "Price: $$price"

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            finishFragment().apply {
            }
    }
}