package com.example.quizkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizkotlin.databinding.AnswersBinding

class Answer_Fragment : Fragment() {


    private var _binding: AnswersBinding? = null
    private val binding: AnswersBinding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AnswersBinding.inflate(inflater, container, false)
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