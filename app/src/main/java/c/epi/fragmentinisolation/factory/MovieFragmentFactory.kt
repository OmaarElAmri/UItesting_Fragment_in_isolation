package c.epi.fragmentinisolation.factory


import androidx.fragment.app.FragmentFactory
import c.epi.fragmentinisolation.movie.DirectorsFragment
import c.epi.fragmentinisolation.movie.MovieDetailFragment
import c.epi.fragmentinisolation.movie.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }


}













