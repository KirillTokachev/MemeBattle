package com.example.memebattle.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.memebattle.databinding.FragmentMemeBinding
import com.example.memebattle.presentation.view_model.MemeViewModel
import com.example.memebattle.presentation.view_model.ViewModelFactory
import com.squareup.picasso.Picasso
import javax.inject.Inject

class MemeFragment : Fragment() {
    private var _binding: FragmentMemeBinding? = null
    private val binding
        get() = _binding ?: throw NullPointerException("MemeFragment is null")

    private lateinit var viewModel: MemeViewModel

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
        _binding = FragmentMemeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this, viewModelFactory)[MemeViewModel::class.java]

        /*viewModel.meme.observe(viewLifecycleOwner) {
            Picasso.get().load(it.random().imageMeme).into(binding.memeIv)
        }*/

        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}