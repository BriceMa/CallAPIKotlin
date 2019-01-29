package com.example.brice.rickandmorty.network

import android.hardware.camera2.CaptureFailure
import com.android.volley.NetworkResponse
import com.android.volley.Request
import com.android.volley.VolleyError
import com.example.brice.rickandmorty.response.Episode
import com.example.brice.rickandmorty.response.ResultEpisode
import com.neopixl.spitfire.listener.RequestListener
import com.neopixl.spitfire.request.BaseRequest

class EpisodeService {
    companion object {
        fun getEpisodes(success: (episodes: List<Episode>) -> Unit,
                        failure: (error: VolleyError?) -> Unit){
//          1 - Récupération de l'URL

            val url:String = UrlBuilder.episodesUrl

//          2 - Call HTTP
//          3 - Parsing JSON
//          4 - Envoi des données (Callback)

            val request
                    = BaseRequest.Builder<ResultEpisode>(Request.Method.GET, url, ResultEpisode::class.java)
                .listener(object: RequestListener<ResultEpisode>{

                    override fun onSuccess(
                        request: Request<ResultEpisode>,
                        response: NetworkResponse,
                        result: ResultEpisode?
                    ) {
                        val episode = result?.results ?: emptyList()
                    }

                    override fun onFailure(
                        request: Request<ResultEpisode>,
                        response: NetworkResponse?,
                        error: VolleyError?
                    ) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                })

//          5 - Stockage des données dans une BDD locale (optionnel)
        }
    }

}