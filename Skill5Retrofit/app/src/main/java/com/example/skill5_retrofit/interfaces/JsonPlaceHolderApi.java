package com.example.skill5_retrofit.interfaces;

import com.example.skill5_retrofit.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
