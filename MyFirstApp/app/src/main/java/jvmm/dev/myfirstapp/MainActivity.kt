package jvmm.dev.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var contador = 0 //VAR para variables
        val btnClickMe = findViewById<Button>(R.id.clickMebtn) //VAL para los componentes. No se pueden cambiar
        //VAR y CONST  son iguales. Salvo que VAL es en tiempo de ejecución y CONST en tiempo de compilación
        val tvTextDisplay = findViewById<TextView>(R.id.textDisplay)
        btnClickMe.setOnClickListener {
            contador++
            tvTextDisplay.text = "Contador = "+contador
            //Los toast son un Popup que aparecen abajo.
            Toast.makeText(this, "Soy una tostada!", Toast.LENGTH_LONG).show()
        }
    }
}