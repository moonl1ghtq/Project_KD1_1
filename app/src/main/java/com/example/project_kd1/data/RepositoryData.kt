package com.example.project_kd1.data

import com.example.project_kd1.domain.GetDataUseCase
import com.example.project_kd1.data.model.ModelData
import com.example.project_kd1.domain.Repository


class RepositoryData(private val getDataUseCase: GetDataUseCase): Repository {

    override suspend fun getData(): ModelData {
        return getDataUseCase.client.getDataFromAPI()
    }
}