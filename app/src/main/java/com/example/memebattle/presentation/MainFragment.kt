package com.example.memebattle.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.memebattle.R
import com.example.memebattle.databinding.FragmentMainBinding
import com.example.memebattle.presentation.view_model.MainViewModel
import com.example.memebattle.presentation.view_model.ViewModelFactory
import com.parse.ParseObject
import com.parse.ParseQuery
import javax.inject.Inject

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding
        get() = _binding ?: throw NullPointerException("MainFragment is null")

    private lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val component by lazy {
        (requireActivity().application as MemeApplication).component
    }

    override fun onAttach(context: Context) {
        component.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]

        binding.generateQuestionButton.setOnClickListener {
            viewModel.questionList.observe(viewLifecycleOwner) {
                binding.memeTv.text = it.random().toString()
            }
        }

        binding.generateMemeButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_memeFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}