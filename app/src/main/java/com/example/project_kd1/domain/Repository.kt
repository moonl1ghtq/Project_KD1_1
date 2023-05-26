package com.example.project_kd1.domain

import com.example.project_kd1.data.model.ModelData

interface Repository {
    suspend fun getData(): ModelData
}