package com.example.gabrieleluanprojetomobile.model

import com.google.gson.annotations.SerializedName

class Ong {
    @SerializedName("id")
    var id: Int? = null

    @SerializedName("nome")
    var nome: String? = null

    @SerializedName("desc")
    var desc: String? = null

    @SerializedName("imagem")
    var imagem: String? = null

    @SerializedName("site")
    var site: String? = null

    @SerializedName("cnpj")
    var cnpj: String? = null

    @SerializedName("pix")
    var pix: String? = null
}
