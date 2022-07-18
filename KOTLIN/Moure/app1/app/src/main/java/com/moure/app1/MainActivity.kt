/* KOTLIN: Curso ANDROID desde CERO para PRINCIPIANTES
. moureDev, youtube
*/
package com.moure.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lesson 1
        //variables()

        // Lesson 2
        //tiposDeDatos()

        // Lesson 3
        //sentencia_if()

        // Lesson 4
        //sentenciaWhen()

        // Lesson 5 colecciones
        //arrays()

        // Lesson 6 mapas
        //maps()

        // Lesson 7 loops
        //loops()

        // Lesson 8
        nullSafety()

    }//class MainActivity()
    // ------------------------------------------------

    // ------------------------------------------------
    private fun variables(){

        // ---- VARIABLES: --------------------------
        var vnum1 = 5
        //println("el numero es->", vnum1)
        println( vnum1 )

        var vcadena1 = "Suscribete"
        println( vcadena1 )


        // ------ CONSTANTES: -------------------------
        val const1 = "primera constante"
        println("constante -> ${const1}")
    } // fun variables()
    // ------------------------------------------------

    // ------------------------------------------------
    private fun tiposDeDatos(){

        val myString1 = "hola hackerman"
        val myString2 = "bienvenido a moureDev"
        val myString3 = myString1 + ' ' + myString2
        println( myString3 )

        // Integer:
        val myInt1 = 2
        val myInt2 = 3
        val myInt3 = myInt1 + myInt2
        println("suma -> ${myInt3} ")

        // Decimales : float y double
        val myFloat1 = 1.5f
        val myDouble1 = 1.5
        val myDouble2 = 2.5
        val myDouble3 = 1.0
        val myDouble4 = myFloat1 + myDouble1 + myDouble2 + myDouble3
        println( "result float + double -> ${myDouble4}")

        // Boolean
        val vcierto1 = true
        val vcierto2 = false

        println( vcierto1 == true)
        println( vcierto1 && vcierto2 )
    } // tipos de datos
    // ------------------------------------------------

    // ------------------------------------------------
    private fun sentencia_if(){
        // >, <, >=, <=, ==, !=   opciones.
        // && ||  !
        val myNumber = 10
        if( myNumber <= 10){
            println("********************************")
            println("$myNumber es menor o igual a 10")
        } else{
            println("$myNumber es mayor o igual a 10")
        }

        // elseif

    }// fun sentencia_if()
    // ------------------------------------------------

    // ------------------------------------------------
    private fun sentenciaWhen(){
        // When con String
        val country = "Spain"

        when (country) {
            "Spain"     -> { println("idioma espanol") }
            "Mexico"    -> { println("idioma espanol") }
            "EEUU"      -> { println("idioma espanol") }

            else -> {  println("no conocemos el idioma  ☹") }

        }// when

        val num = 7
        when(num) {
            0,1,2,3,4->{println("es 1")}
            in 5..10 ->{println("de 5 a 10")}
            else ->{println("☹ no se.")}
        }// when

    } // sentenciaWhen
    // ------------------------------------------------

    // ------------------------------------------------
    // Leccion 5 colecciones
    private fun arrays(){

        // -------------------------------------------------------
        // VARIABLES
        val name    = "Brais"
        val surname = "Moure"
        val company = "MoureDev"
        val age     = "32"

        //  CREACION de un Array:
        val myArray = arrayListOf<String>()
        // -------------------------------------------------------

        // -------------------------------------------------------
        // ADD datos de a UNO: ->  .add()
        myArray.add(name)           // e 0
        myArray.add(surname)        // e 1
        myArray.add(surname)        // e 2
        myArray.add(surname)        // e 3
        //
        println( myArray )
        //
        // Add un CONJUNTO de datos : ->  .addAll()
        myArray.addAll( listOf( company, age, "Saludos!!!") )
        myArray.addAll( listOf("Hola", "bienvenidos al tuto") )
        // -------------------------------------------------------

        // training:
        val array1 = arrayListOf<String>()
        //
        array1.add(age)
        array1.addAll( listOf(name, surname) )
        // numerico :
        // val arrNums = arrayListOf<>()   // Numerico
        // -------------------------------------------------------
        println("************************************************")
        println( myArray )
        // -------------------------------------------------------


        // ---- ACCESO A DATOS del array :
        val vcompany = myArray[2]
        println("company : ${vcompany}.")

        // ------- UPDATE DATA -----------------------
        myArray[7]="Suscribete y activa la campana"
        var mensaje = myArray[7]
        println(mensaje)

        // ---------- BORRAR ELEMENTO --------------
        //   ???
        myArray.removeAt(3)
        println(  myArray )


        // ------  ITERAR -----------------
        println("\n ------------ forEach() -----------------")
        myArray.forEach {
            println(it)
        }
        println("\n")


        // --------- FUNCIONES ------------------------------
        println( myArray.count()    )
        println( myArray.first()    )
        println( myArray.last()     )
        println( myArray.sort()     )
        println( myArray.sortDescending()   )


        println(" ========================================")
        // ------   numerico  ------------------------------
        // <Int> es opcional.
        val arr = arrayOf<Int>(2,4,6,8,10,12)
        // println( arr.get[0] , arr.get[5] )  Error.
        println( "1=> ${arr[0]}  \n2.=> ${arr[5]}" )

        for( i in arr){
            println("Int-> ${i}")
        }

        // Double :

        val arr2 = arrayOf<Double>( 2.0, 4.0, 6.0, 8.0, 10.0, 12.0 )
        println("\n")
        for (i in arr2) {
            println("Doble-> ${i}")
        }


        val arr3 = arrayOf<String>( "pepe","ana","viviana","beto" )
        println("\n")
        for (i in arr3) {
            println("String-> ${i}")
        }
        println(" ========================================")

        // DATOS GENERICOS : (sin ->  <String>            OJO
        val arr4 = arrayOf( "pepe","ana", 10,20,30,"raul" )
        println("\n")
        for (i in arr4) {
            println("String-> ${i}")
        }
        println(" ========================================")

    }// fun arrays
    // -----------------------------------------------------------

    // ==============================================================
    private fun maps(){

        //Sintaxis declaracion
        /*Esta definición solo te provee acceso de solo lectura, por lo
         que solo podrás usar comportamientos de consulta*/

        // ojo. no usar val. es constante.
        // -------------------------------------------------------
        var myMap: Map<String, Int> = mapOf()
        var myMap2: Map<String, Int> = mapOf()
        //Definicion con elementos.
        // Pisa el objeto mapa:                         //              ojo
        myMap = mapOf("Brais" to 1, "pedro" to 2, "Sara" to 5 )
        println("\n =============== map() ======================")
        println( "myMap-> $myMap")


        // dado el mapa:
        myMap2 = mutableMapOf("Brais" to 1, "pedro" to 2, "Sara" to 5 )

        // Add al ultimo del mapa
        // Add los elementos: mapa["nueva clave"] = new value
        myMap2["Ana"] = 6
        myMap2["maria"]=7
        myMap2["Brais"]=8
        myMap2["Marcos"]=9
        myMap2.put( "Juan", 11 )
        // Add con .put
        myMap2.put( "Viviana", 12 )


        // Imprimir
        println( " el myMap2 es -> $myMap2" )

        // ACCESO : mapa["clave"] => entrega valor
        println( " marcos es:  ${myMap2["Marcos"] }") // marcos es: 9
        //println(  myMap2[8] )             Error

        //UPDATE: mapa["clave"] = nuevo valor
        myMap2["Marcos"]=10


        // Imprimir DATOS DEL MAP
        println( "myMap2=> $myMap2" )

        println("\nDATOS DE myMap2")
        println( " entries: ${myMap2.entries}" )
        println( " size: ${myMap2.size}")
        println( " keys: ${myMap2.keys} ")
        println( " values: ${myMap2.values} ")


        // DELETE ELEMENTO MAP
        myMap2.remove(  "Marcos" )   // sin clave. segun valor
        //
        myMap2.put( "carlos", 10 )

        println("Marcos removido $myMap2")
        //
        println("\n --------------------------------------------")

    }// fun maps()
    // ==============================================================


    // ==============================================================
    private fun loops(){

        val myArray = listOf<String>("Hola","bienvenido al tut.", "Suscribete")
        val myMap = mutableMapOf( "Brais" to 1, "Pedro" to 2, "Sara" to 5 )

        println("\n myStr in myArray ========================================")
        //for
        for( myStr in myArray ){
            println( myStr )
        }
        println("\n e in myArray --------------------------")
        for(  e in myMap ){
            println( e )
        }

        // RANGOS :

        println("\n x aumenta 1")
        for( x in 0..10){ println( x ) } // 0 a 10

        println("\n x aumenta 1")
        for( x in 1..10){ println( x ) }    // 1 a 10

        println("\n 9 until 30")
        for( x in 9 until 30) { println( x) }  //   9 a 29    ojo

        println("\n x aumenta 2")
        for( x in 0..10 step 2){ println( x ) } //  0 a 10 de a 2

        println("\n 10 downTo 0")       //  de 10 a 0
        for( x in 10 downTo 0 ){ println( x ) }

        // ------- DEFINICION DE UN ARRAY CON RANGO -------------
        println("\n Array x rango -> myNumArr 0..20")
        val myNumArr =(0..20)           //
        for( e in myNumArr ){
            println(e)
        }

        // WHILE ()
        println("\n")
        var x = 0
        while( x < 10){
            println(x)
            x++
        }
        println("\n ========================================")
    }// loops()
    // ==============================================================




    // ==============================================================
    // seguridad contra nulos.
    private fun nullSafety(){

        println("\n ===============================")

        var myString = "MoureDev"
        // si asigno null da error
        //myString = null       No se puede imprimir, compiler error.
        println( " 1 => myString " )

        // ? = PUEDE SER NULL, nullable.
        var mySafetyStr: String? = "MoureDev proteccion a null"
        mySafetyStr = null
                println("2 => $mySafetyStr" )                          //==>  null



        mySafetyStr = "SUSCRIBETE !" // con operador  (!!)   ojo.
                if ( mySafetyStr != null ){
                    println("3 => No es nula --> ${mySafetyStr} ")  // hola
                }else{
                    println("4 => var = null   var es nula")
                }
        //o mejor:
        println( "6 => var nula-> $mySafetyStr?.length" )     // 12
        // PARA NO COMPROBAR CON IF, Usar var?.funcion

        // SAFE CALL ---------------------------------- :
        mySafetyStr = null
        println( "7 => var nula-> $mySafetyStr?.length" )          // null

        println("8=> longitud nula -->${ mySafetyStr?.length} ?:'es nula' " )


        mySafetyStr?.let{
            println( "9 => it" )
        } ?: run { println(mySafetyStr) }




        // OPERADOR !! ( NOT NULL)                              OJO
        //
        var mySafety: String? = "No se cae con cadena" //null
        // con el codigo de abajo no da error pero se debe estar muy
        // seguro de q la var NO es null. sino dara error Null Pointer Exception.
        println( "9 =>$mySafety!!.length " )



        var a : String? = null
        var b = a?.length ?: "a y b son nulas"
        println(" a-> $a")
        println(" b-> $b")

        mySafetyStr = "Suscribete!"
        println("10 => longitud con valor--->${ mySafetyStr?.length} " ) // 11
        // -----------------------------------------------------

        println("\n ===============================")
    }// fun nullSafety()
    // ==============================================================


}// class MainActivity