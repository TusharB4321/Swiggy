package com.example.swiggy.model

data class DineoutDataClass (
    var hotelImage: Int,
    var hotelName: String = "",
    var hotelRating: String = "",
    var hotelLocation: String = "",
    var hotelDistance: String = "",
    var hotelType: String = "",
    var hotelPrice: String = ""
)