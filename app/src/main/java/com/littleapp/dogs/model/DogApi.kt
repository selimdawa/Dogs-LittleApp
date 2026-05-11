package com.littleapp.dogs.model

import com.google.gson.annotations.SerializedName

data class DogApi(@SerializedName("message") val images: List<String>)