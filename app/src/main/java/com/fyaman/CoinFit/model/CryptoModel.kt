package com.fyaman.CoinFit.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    val name : String,
    @SerializedName("currency")
    val symbol : String,
    @SerializedName("price")
    val price: String,
    @SerializedName("logo_url")
    val logoURL : String,
    @SerializedName("rank")
    val rank : String

    )