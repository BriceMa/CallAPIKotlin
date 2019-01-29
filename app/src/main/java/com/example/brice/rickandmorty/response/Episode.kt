package com.example.brice.rickandmorty.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

class Episode {
    var id = 0
    lateinit var name:String

    @JsonProperty(value = "air_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMMMM d, yyyy")
    lateinit var airDate: Date
    lateinit var characters: List<String>
    lateinit var url: String

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-ddTHH:mm:ss.SSSZ")
    lateinit var created:Date
}