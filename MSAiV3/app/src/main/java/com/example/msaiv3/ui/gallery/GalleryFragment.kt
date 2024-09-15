package com.example.msaiv3.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.msaiv3.R
import com.example.msaiv3.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    private lateinit var userInput: EditText
    private lateinit var submitButton: Button
    private lateinit var resultText: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Initialize UI elements
        userInput = binding.userInput
        submitButton = binding.submitButton
        resultText = binding.resultText

        // Set up button click listener
        submitButton.setOnClickListener {
            checkInput()
        }

        return root
    }

    private fun checkInput() {
        val inputText = userInput.text.toString().trim()
        val correctAnswer = "What is Math?" // Replace with your actual answer

        if (inputText.equals(correctAnswer, ignoreCase = true)) {
            showResult("it is the abstract science of number, quantity, and space. Mathematics may be studied in its own right ( pure mathematics ), or as it is applied to other disciplines such as physics and engineering ( applied mathematics ).", true)
        } else {
            showResult("Try Again!", false)
        }
    }

    private fun showResult(message: String, isCorrect: Boolean) {
        resultText.text = message
        resultText.visibility = View.VISIBLE

//         Flash the text color to indicate feedback
        resultText.setTextColor(resources.getColor(if (isCorrect) R.color.green else R.color.red, null))

        resultText.postDelayed({
            resultText.visibility = View.INVISIBLE
        }, 15000) // Flash duration: 15 seconds
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
