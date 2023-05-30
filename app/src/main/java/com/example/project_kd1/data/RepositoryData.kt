package com.example.project_kd1.data


import com.example.project_kd1.data.model.ModelData
import com.example.project_kd1.data.remote.ApiService
import com.example.project_kd1.domain.Repository


class RepositoryData(private val ApiService: ApiService): Repository {

    override suspend fun getData(): ModelData {
        return ApiService.client.getDataFromAPI()
    }
}