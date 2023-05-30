package com.example.project_kd1.presentation.first


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.project_kd1.R
import com.example.project_kd1.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    private val viewModel1: ViewModel1 by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)

         val imageView = binding.imageView

         Glide.with(this)
             .load(viewModel1.imageUrl)
             .into(imageView)

        binding.button.setOnClickListener {

            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }


    }



















    fun divide( a:Float,b:Float,c:Float): Float {


        return a.toFloat() / b.toFloat()

    }

}




