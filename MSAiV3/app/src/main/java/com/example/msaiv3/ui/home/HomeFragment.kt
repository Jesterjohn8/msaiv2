package com.example.msaiv3.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.msaiv3.R
import com.example.msaiv3.databinding.FragmentHomeBinding
import com.example.msaiv3.Mathematics
import com.example.msaiv3.Science

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the button by its ID
        val math = view.findViewById<Button>(R.id.buttonMathematics)
        val science = view.findViewById<Button>(R.id.buttonSciences)

        math.setOnClickListener {
            // Create an Intent to start AnotherActivity
            val intent = Intent(activity, Mathematics::class.java)
            startActivity(intent)
        }
        science.setOnClickListener {
            // Create an Intent to start AnotherActivity
            val intent = Intent(activity, Science::class.java)
            startActivity(intent)
        }

    }}