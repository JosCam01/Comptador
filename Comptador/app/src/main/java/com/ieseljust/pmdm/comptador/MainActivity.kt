package com.ieseljust.pmdm.comptador


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    var comptador=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewComptador)

        // Inicialitzem el TextView amb el comptador a 0
        textViewContador.setText(comptador.toString())

        // Referencia al botón +
        val btAdd=findViewById<Button>(R.id.btAdd)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        btAdd.setOnClickListener {
            comptador++
            textViewContador.setText(comptador.toString())
        }

            // Referencia al botón -
            val btRem=findViewById<Button>(R.id.btResta)

            // Asociaciamos una expresióin lambda como
            // respuesta (callback) al evento Clic sobre
            // el botón
            btRem.setOnClickListener {
                comptador--
                textViewContador.setText(comptador.toString())
            }
        // Referencia al botón RESET
        val btRes=findViewById<Button>(R.id.btReset)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        btRes.setOnClickListener {
            comptador=0
            textViewContador.setText(comptador.toString())
        }

    }
}