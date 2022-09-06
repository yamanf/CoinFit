package com.fyaman.CoinFit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fyaman.CoinFit.databinding.ActivityDetailsBinding
import com.fyaman.CoinFit.model.CryptoModel

class DetailsActivity : AppCompatActivity() {
     lateinit var binding:ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        setView()

    }
    fun setView(){
        val cryptoList : ArrayList<CryptoModel>
        binding.coinName.text= intent.getStringExtra("id")

    }
}