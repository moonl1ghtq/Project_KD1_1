package com.example.project_kd1.presentation.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kd1.data.RepositoryData
import com.example.project_kd1.data.model.ModelData
import com.example.project_kd1.data.remote.ApiService
import com.example.project_kd1.domain.GetDataUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel2 : ViewModel() {
    private var useCase: GetDataUseCase = GetDataUseCase(RepositoryData(ApiService()))

    private val mutableLiveData = MutableLiveData<ModelData>()
    val myLiveData: LiveData<ModelData>
        get() = mutableLiveData

    fun loadData(){
        viewModelScope.launch(Dispatchers.IO) {
            mutableLiveData.postValue(
                useCase.getDataUseCase()
            )
        }
    }
}