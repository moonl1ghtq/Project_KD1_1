package com.example.project_kd1.presentation.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kd1.data.RepositoryData
import com.example.project_kd1.data.model.ModelData
import com.example.project_kd1.domain.GetDataUseCase
import com.example.project_kd1.domain.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel2 : ViewModel() {
    private var repository: Repository = RepositoryData(GetDataUseCase())

    private val mutableLiveData = MutableLiveData<ModelData>()
    val myLiveData: LiveData<ModelData>
        get() = mutableLiveData

    fun loadData(){

        viewModelScope.launch(Dispatchers.IO) {
            mutableLiveData.postValue(
                repository.getData()
            )
        }
    }
}