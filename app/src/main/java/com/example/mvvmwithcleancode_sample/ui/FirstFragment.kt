package com.example.mvvmwithcleancode_sample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mvvmwithcleancode_sample.R
import com.example.mvvmwithcleancode_sample.databinding.FragmentFirstBinding
import com.example.mvvmwithcleancode_sample.ui.home.HomeActivity

class FirstFragment : Fragment(){

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.buttonFirst?.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding?.buttonGotoList?.setOnClickListener {
            HomeActivity.starter(this.requireActivity())
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}