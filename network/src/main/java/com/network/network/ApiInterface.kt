package com.network.networkimport com.google.gson.JsonObjectimport com.network.models.ModelHomeimport com.network.models.ModelMyProfileimport com.network.models.ModelPrivacyTermsimport com.network.models.ModelProfileimport com.network.models.ModelUploadFileimport com.network.models.ModelUserimport okhttp3.MultipartBodyimport retrofit2.Responseimport retrofit2.http.*interface ApiInterface {    //AUTH    //login    @POST("auth/login")    suspend fun login(        @Body body: JsonObject,    ): Response<SimpleResponse>    //email, otp    @POST("auth/verifyOtp")    suspend fun verifyOtp(        @Body body: JsonObject,    ): Response<ModelUser>    //resendOtp    @POST("resendOtp")    suspend fun resendOtp(        @Body body: JsonObject,    ): Response<SimpleResponse>/*    //signup    @POST("auth/signup")    suspend fun signup(        @Body body: PostSignup,    ): Response<ModelUser>*/    //UPLOAD FILE (IMAGES AND VIDEOS)    @Multipart    @POST("uploadFile")    suspend fun uploadFile(        @Part url: MultipartBody.Part,    ): Response<ModelUploadFile>    //home    @GET("home")    suspend fun home(        @Query("page") page: Int,        @Query("per_page") per_page: Int,    ): Response<ModelHome>/*        //notifications        @GET("notifications")        suspend fun getNotifications(        ): Response<ModelNotification>    */    //myProfile    @GET("auth/me")    suspend fun myProfile(    ): Response<ModelMyProfile>    //support    @POST("support")    suspend fun support(        @Body body: JsonObject,    ): Response<SimpleResponse>    //privacyPolicy    @GET("privacyPolicy")    suspend fun privacyPolicy(    ): Response<ModelPrivacyTerms>    //terms    @GET("terms")    suspend fun terms(    ): Response<ModelPrivacyTerms>    //deleteAccount    @DELETE("auth/deleteAccount")    suspend fun deleteAccount(    ): Response<SimpleResponse>    //logout    @POST("auth/logout")    suspend fun logout(        @Body body: JsonObject,    ): Response<SimpleResponse>    //profile    @GET("profile")    suspend fun profile(        @Query("id") id: Int,    ): Response<ModelProfile>}