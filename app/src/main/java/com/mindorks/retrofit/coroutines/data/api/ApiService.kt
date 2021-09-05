package com.mindorks.retrofit.coroutines.data.api

import com.mindorks.retrofit.coroutines.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("ff6a2ea3-f1dc-45f5-b183-b725dc139b35")
    suspend fun getUsers(): List<User>

}