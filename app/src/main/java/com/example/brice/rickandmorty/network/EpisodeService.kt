package com.example.brice.rickandmorty.network

class EpisodeService {
    companion object {
        fun getEpisodes(){
            // 1 - Récupération de l'URL

            val url:String = UrlBuilder.episodesUrl
            // 2 - Call HTTP
            // 3 - Parsing JSON
            // 4 - Envoi des données (Callback)
            // 5 - Stockage des données dans une BDD locale (optionnel)
        }
    }

}