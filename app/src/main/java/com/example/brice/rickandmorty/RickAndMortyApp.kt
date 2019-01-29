package com.example.brice.rickandmorty

import android.app.Application
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

// Application = composant principal au dessus de toutes les activités
// Ce composant doit être déclaré dans le Manifest

class RickAndMortyApp: Application() {

    companion object {
        lateinit var resquestQueue: RequestQueue
    }
    // Méthode appelé au démarrage de l'app
    override fun onCreate() {
        super.onCreate()

        resquestQueue = Volley.newRequestQueue(this)
    }
}