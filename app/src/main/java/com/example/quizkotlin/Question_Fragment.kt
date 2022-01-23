package com.example.quizkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.quizkotlin.databinding.AnswersBinding
import com.example.quizkotlin.databinding.QuestionsBinding

class Question_Fragment :Fragment() {

    private var _binding: QuestionsBinding? = null
    private val binding: QuestionsBinding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {


        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
