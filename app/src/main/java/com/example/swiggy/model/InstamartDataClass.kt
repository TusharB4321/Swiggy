package com.example.swiggy.model

data class InstamartDataClass(
    var productImage: Int,
    var productCompany: String = "",
    var productName: String = "",
    var productNameTamil: String = "",
    var productWeight: String = "",
    var orgPrice: String = "",
    var disPrice: String = "",
)