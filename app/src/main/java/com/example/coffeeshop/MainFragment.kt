package com.example.coffeeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton


class MainFragment : Fragment() {


    private var _binding: MainFragment? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val orderButton: AppCompatButton = view.findViewById(R.id.OrderButton)
        orderButton.setOnClickListener {
            val bundle = Bundle().apply {
                putDouble("price", 5.53)
            }

            val finishFragment = finishFragment().apply {
                arguments = bundle
            }

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer,finishFragment)
                .commit()
        }
    }


    companion object {

        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
            }
    }
}