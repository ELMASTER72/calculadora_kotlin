package com.elmaster72.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var camponombre: EditText? = null
    var campomateria: EditText? = null
    var camponota1: EditText? = null
    var camponota2: EditText? = null
    var camponota3: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        camponombre=findViewById(R.id.txtnombre)
        campomateria=findViewById(R.id.txtmateria)
        camponota1=findViewById(R.id.txtnota1)
        camponota2=findViewById(R.id.txtnota2)
        camponota3=findViewById(R.id.txtnota3)

        val botoncalcular:Button=findViewById(R.id.btnCalcular)
        botoncalcular.setOnClickListener {onClick()}

    }
    private fun onClick(){




        var nombre:String = camponombre!!.text.toString()
        var materia:String = campomateria!!.text.toString()
        val nota1:Double = camponota1!!.text.toString().toDouble()
        val nota2:Double = camponota2!!.text.toString().toDouble()
        val nota3:Double = camponota3!!.text.toString().toDouble()

        var Promedio:Double=(nota1+nota2+nota3)/3

        val intent = Intent(this, Result::class.java)
        val mibundle:Bundle=Bundle()
        mibundle.putString("Nombre", camponombre!!.text.toString())
        mibundle.putString("Materia", campomateria!!.text.toString())
        mibundle.putDouble("Promedio",Promedio.toString().toDouble())

        intent.putExtras(mibundle)
        startActivity(intent)



    }
}