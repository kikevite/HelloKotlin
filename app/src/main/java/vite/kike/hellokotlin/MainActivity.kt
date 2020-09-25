package vite.kike.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia a boto
        var boto: Button = findViewById(R.id.botoID)
        // Listener
        boto.setOnClickListener { variables()
            ifs()
            whens()
            arrays()
            maps()
            bucle()
            nullsafety()
        }
    }

    private fun variables() {
        println("variables")
        var frase = "hola" // String
        var entero = 2 // Int
        var doble = 2.3 // Double
        var float = 4.6f // Float
        var ences = true// Boolean
        val constant = "consss" // Constant
        // Per parts
        println(frase + " " + entero + " " + doble * 2 + " " + ences + " " + constant)
        // Valors
        println("$frase $entero ${doble * 2} $ences $constant")

        var arrayNumeric = (0..10) // array [0,1,..,9,10]
    }

    private fun ifs() {
        println("ifs")
        var numero = (1..6).random() // 1 i 6 inclossos
        var resultTXT: TextView = findViewById(R.id.resultText)
        resultTXT.text = numero.toString() // Assignem Text

        var ences = true
        val constant = "consss"
        var entero = 2
        var num = 0
        if (ences != true) {
            num = 1
        } else if (constant == "hgdhcjb") {
            num = 2
        } else if (entero <= 2) {
            num = 3
        } else {
            num = 4
        }
        Toast.makeText(this, num.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun whens() {
        println("whens")
        var frase = "hola"
        when (frase) {
            "opcio1", "opcio2" -> {
                Toast.makeText(this, "5", Toast.LENGTH_LONG).show()
            }
            "hola" -> {
                Toast.makeText(this, "6", Toast.LENGTH_LONG).show()
            }
        }

        var entero = 5
        when (entero) {
            in 4..6 -> { // Els dos estan inclossos
                println(frase)
            }
        }
    }

    private fun arrays()  {
        println("arrays")
        var myArry = arrayListOf<String>()
        myArry.add("text1")
        myArry.add("text2")
        myArry.add("text3")
        myArry.addAll(listOf("text4", "text5"))

        myArry[0] = "asdf"
        myArry.removeAt(0)

        myArry.forEach {
            println(it)
        }

        println(myArry.count())
        myArry.clear()
    }

    private fun maps() {
        println("maps")
        var myMap: Map<String, Int>
        myMap = mutableMapOf("kike" to 78093, "mare" to 78148)
        myMap["algu1"] = 456
        myMap.put("algu2", 789)

        println(myMap["algu1"])
        myMap.remove("algu1")
        println(myMap)
    }

    private fun bucle() {
        var myArry = arrayListOf<String>()
        myArry.add("text1")
        myArry.add("text2")
        myArry.add("text3")
        myArry.addAll(listOf("text4", "text5"))

        for (element in myArry) {
            println(element)
        }

        var myMap: Map<String, Int>
        myMap = mutableMapOf("kike" to 78093, "mare" to 78148)
        myMap["algu1"] = 456
        myMap.put("algu2", 789)

        for (element in myMap) {
            println("${element.key} ${element.value}")
        }

        // imprimeix 0, 1,... 9, 10
        for (value in 0..10) {
            println(value)
        }

        // imprimeix 0, 1,... 8, 9
        for (value in 0 until 10) {
            println(value)
        }

        // imprimeix 10, 9,... 1, 0
        for (value in 10 downTo 0) {
            println(value)
        }

        var c = 0
        while (c < 3) {
            c++
        }

    }

    private fun nullsafety() {
        var paraula = "hola"
        //paraula = null
        // Aquest null peta

        var paraula2: String? = "eii"
        paraula2 = null
        // aquest null no peta


        // Lo de !!


        // Lo de ?


        println(paraula2?.length)
        // si paraula2 es null, escriura null, sino, 4

        // Aixo s'executara quan paraula2 no sigui null
        paraula2?.let {
            // Aixo s'executara quan paraula2 NO sigui null
            println(it)
        } ?: run {
            // Aixo s'executara quan paraula2 SI sigui null
        }
    }
}