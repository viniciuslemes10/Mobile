package br.com.app.handsonkotlinappclockdigital

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var txtHoraAtualizada: TextView? = null
    private var txtHora24_Atual: TextClock? = null
    private var txtHoraAtual: TextClock? = null
    private var btnAtualizaHora: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDeLayout()
    }

    fun atualizarHoraAtual(view: View) {
        txtHoraAtualizada!!.setText("Hora: " + txtHora24_Atual!!.getText())
    }

    private fun iniciarComponentesDeLayout() {
        txtHoraAtual = findViewById(R.id.txtHoraAtual)
        txtHora24_Atual = findViewById(R.id.txtHora24_Atual)
        txtHoraAtualizada = findViewById(R.id.txtHoraAtualizada)
        btnAtualizaHora = findViewById(R.id.btnAtualizaHora)

        txtHoraAtual?.timeZone = "America/Sao_Paulo"
        txtHora24_Atual?.timeZone = "America/Sao_Paulo"
    }
}