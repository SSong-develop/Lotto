package com.example.lotto.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.example.lotto.data.api.RetrofitBuilder
import com.example.lotto.data.api.RetrofitHelper
import com.example.lotto.data.model.LottoData
import com.example.lotto.data.repository.MainRepository
import com.example.lotto.utills.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(
    private val mainRepository: MainRepository
) : ViewModel() {
    private val METHOD : String = "getLottoNumber"
    private val LOTTO_ROUND = 929

    private val _lottoNumber = MutableLiveData<Resource<LottoData>>() // ViewModel에서 접근 가능한 데이터
    val lottoNumber : MutableLiveData<Resource<LottoData>> // UI에서 접근이 가능한 데이터
    get() = _lottoNumber

    fun getLottoNumber() : LiveData<Resource<LottoData>>{
        return lottoNumber
    }

    /**
     * ViewModelFactory pattern을 이용해 custom ViewModel을 생성했습니다.
     * 매개변수로 받아오는 것은 MainRepository이며 이 repo를 사용해 네트워킹을 대신 해줄 수 있습니다.
     * 단점으로는 MainViewModel이 호출되는 단 한번에만 호출되기 때문에 데이터를 단 한번만 가져와야 되는 경우에
     * 사용하는 것이 바람직해 보입니다.
     */

    fun onlyOneCall() = viewModelScope.launch {
        _lottoNumber.value = Resource.success(mainRepository.getLottoCoroutines())
    }

    /**
     * repository pattern을 이용해 네트워킹을 사용했다.
     * 단점 : Repository의 크기가 커진다면 오히려 이 경우가 효과가 떨어지지 않을까라고 생각한다.
     */
    fun getLottoCoroutineMine() = viewModelScope.launch {
        val repo = MainRepository(RetrofitHelper(RetrofitBuilder.retrofitService))
        _lottoNumber.value = Resource.success(repo.getLottoCoroutines())
    }
}