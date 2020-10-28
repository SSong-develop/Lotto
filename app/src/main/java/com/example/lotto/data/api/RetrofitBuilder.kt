package com.example.lotto.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    // TODO : EncrupSharedPreference를 사용하면 좀 더 괜찮아 질 거 같음
    private const val URL = "https://www.dhlottery.co.kr"

    // retrofit 객체 생성 함수
    private fun getRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService : RetrofitService = getRetrofit().create(RetrofitService::class.java)
}