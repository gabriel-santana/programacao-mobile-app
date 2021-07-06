package com.example.gabrieleluanprojetomobile.model

import com.google.gson.annotations.SerializedName

class PacoteJSON<T> {

    var date: String? = null
    var status: Int? = null
    var message: String? = null

    @SerializedName("object")
    var objeto: T? = null
}
