package com.example.project_kd1.presentation.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.project_kd1.databinding.Fragment2Binding



class Fragment2 : Fragment() {

    private lateinit var binding: Fragment2Binding
    private val viewModel2: ViewModel2 by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel2.loadData()

        viewModel2.myLiveData.observe(viewLifecycleOwner) {
            binding.textData.text = it.fact
        }

        binding.button.setOnClickListener {

            viewModel2.loadData()
        }


    }
}