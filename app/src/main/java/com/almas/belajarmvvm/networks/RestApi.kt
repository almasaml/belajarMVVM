package com.almas.belajarmvvm.networks

import com.almas.belajarmvvm.models.ListPlaceResponseModel
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApi {
    @GET("Sample.json")
    fun getListPlace(): Observable<ListPlaceResponseModel>
}