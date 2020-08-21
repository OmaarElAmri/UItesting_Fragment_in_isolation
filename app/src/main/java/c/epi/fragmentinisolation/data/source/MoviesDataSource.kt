package c.epi.fragmentinisolation.data.source

import c.epi.fragmentinisolation.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}