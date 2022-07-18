package com.example.platzi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

// CLASE Cursos()
data class Cursos(val nombre: String, val url:String    )

//
class MainActivity : AppCompatActivity() {
    //INSTANCIAR :
    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin", "kotlin")
    // MAIN() FUNCTION
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById(R.id.saludo) as TextView

        /*
        {
            setText("Curso de ${react.nombre} en platzi.com/${react.url}")
        }
        * */

    }//

}// class Main