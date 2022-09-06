package com.fyaman.CoinFit.service
import com.fyaman.CoinFit.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET


interface CryptoAPI {

    @GET("ticker?key=be12ea74c0e771bb4d4c08352598f20e1102c9df")
    fun getData(): Observable<List<CryptoModel>>
    //fun getData(): Call<List<CryptoModel>>



}