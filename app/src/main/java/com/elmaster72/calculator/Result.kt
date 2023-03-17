package com.elmaster72.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val camporesultado=findViewById<TextView>(R.id.lblresultado)
        val campomateria=findViewById<TextView>(R.id.lblresultadomateria)
        val campopromedio=findViewById<TextView>(R.id.lblresultadopromedio)
        val campofinal=findViewById<TextView>(R.id.lblfinal)

        var mibundle: Bundle? = this.intent.extras

        if (mibundle != null){
            camporesultado.text = "Hola ${mibundle.getString("Nombre")}"
            campomateria.text ="Su materia es ${mibundle.getString("Materia")}"
            campopromedio.text = "Su promedio es ${mibundle.getDouble("Promedio")}"
            if (mibundle.getDouble("Promedio")!! >= 3.5){
                campofinal.text = "Gano la materia"
                campofinal.setTextColor(getColor(R.color.Green))
            }else{
                campofinal.text = "Perdio la materia"
                campofinal.setTextColor(getColor(R.color.red))
            }
        }
        val botonsalir:Button=findViewById(R.id.btnsalir)
        botonsalir.setOnClickListener {onClick()}
    }
    private fun onClick(){
        finish()
    }
}