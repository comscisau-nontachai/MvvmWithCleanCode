package com.example.mvvmwithcleancode_sample.ui.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.mvvmwithcleancode_sample.R
import com.example.mvvmwithcleancode_sample.databinding.ActivityHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var productAdapter : ProductListAdapter
    private lateinit var layoutManager: LayoutManager

    private val viewModel : HomeViewModel by viewModel()

    companion object{
        fun starter(context : Context){
            val intent = Intent(context,HomeActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productAdapter = ProductListAdapter()
        layoutManager = LinearLayoutManager(this)

        binding.rvProduct.apply {
            layoutManager = this@HomeActivity.layoutManager
            adapter = productAdapter
        }

        viewModel.homeDataList.observe(this){
            it?.let {
                productAdapter.addDataToList(it)
            }
        }



    }
}