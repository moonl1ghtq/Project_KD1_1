package com.example.project_kd1.domain

import com.example.project_kd1.data.RepositoryData
import com.example.project_kd1.data.model.ModelData


class GetDataUseCase (private val Repository: RepositoryData) {

    suspend fun getDataUseCase() : ModelData{
       return Repository.getData()
    }

}