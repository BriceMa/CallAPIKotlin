package com.example.brice.rickandmorty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.brice.rickandmorty.network.EpisodeService

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EpisodeService.getEpisodes({episodes ->
            episodes.size
        },{

        })
    }
}
