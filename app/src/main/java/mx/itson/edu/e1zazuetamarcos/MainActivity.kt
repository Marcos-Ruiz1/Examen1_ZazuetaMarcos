package mx.itson.edu.e1zazuetamarcos

import android.os.Bundle
import android.renderscript.Sampler.Value
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

var porcentajevalue: Int = 0
var porcentajeNum:Float = 0.0f
var totalNum: Float = 0.0f
var originalPriceNum: Float = 0.0f
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_10Porcentaje: Button = findViewById(R.id.btn_10Porcentaje)
        val btn_15Porcentaje: Button = findViewById(R.id.btn_15Porcentaje)
        val btn_20Porcentaje: Button = findViewById(R.id.btn_20Porcentaje)
        val btn_25Porcentaje: Button = findViewById(R.id.btn_25Porcentaje)
        val btn_30Porcentaje: Button = findViewById(R.id.btn_30Porcentaje)
        val btn_40Porcentaje: Button = findViewById(R.id.btn_40Porcentaje)
        val originalPrice: EditText = findViewById(R.id.etOriginalPrice)
        val porcentage: TextView = findViewById(R.id.tvPorcentage)
        val total: TextView = findViewById(R.id.tvTotal)
        val btn_tip: Button = findViewById(R.id.btn_tip)
        val btn_discount: Button = findViewById(R.id.btn_discount)

        btn_10Porcentaje.setOnClickListener{

            porcentajevalue = 10
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum = originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }
        btn_15Porcentaje.setOnClickListener{
            porcentajevalue = 15
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum = originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }
        btn_20Porcentaje.setOnClickListener{
            porcentajevalue = 20
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum =  originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }
        btn_25Porcentaje.setOnClickListener{
            porcentajevalue = 25
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum =  originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }
        btn_30Porcentaje.setOnClickListener{
            porcentajevalue = 30
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum =  originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }
        btn_40Porcentaje.setOnClickListener{
            porcentajevalue = 40
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese una cantidad en el precio original")
            }else {
                originalPriceNum =  originalPrice.text.toString().toFloat()
                calcularPorcentaje()
                porcentage.setText(porcentajeNum.toString())
            }

        }

        btn_discount.setOnClickListener{
            if(originalPrice.text.toString().isEmpty()){
                total.setText("Ingrese algún valor en el precio original o seleccione un porcentaje de los botones")
            }else{
                totalNum = originalPriceNum - porcentajeNum;
                total.setText(totalNum.toString())
            }

        }

        btn_tip.setOnClickListener{
            if(originalPrice.text.toString().isEmpty() || porcentajevalue==0){
                total.setText("Ingrese algún valor en el precio original o seleccione un porcentaje de los botones")
            }else{
                totalNum = originalPriceNum + porcentajeNum
                total.setText(totalNum.toString())
            }

        }
    }

    fun calcularPorcentaje(): Unit{

        porcentajeNum = (porcentajevalue*originalPriceNum)/100
    }
}