package br.com.app.pooherancakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtNome: TextView
    lateinit var txtSalario: TextView
    lateinit var txtDataAdmissao: TextView
    lateinit var txtComissao: TextView
    lateinit var txtTotalFuncionarios: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()

        criarObjetos()

        var vinicius = Funcionario()
        vinicius.setNome("Vinicius")
        vinicius.setSalario(4500)
        vinicius.setDataAdmissao("15/05/2024")

    }

    private fun iniciarComponentesDoLayout() {
        txtNome = findViewById(R.id.txtNome)
        txtSalario = findViewById(R.id.txtSalario)
        txtComissao = findViewById(R.id.txtComissao)
        txtDataAdmissao = findViewById(R.id.txtDataAdmissao)
        txtTotalFuncionarios = findViewById(R.id.txtTotalFuncionarios)
    }

    private fun criarObjetos() {

        var victor = Gerente()
        victor.setNome("Victor")
        victor.setSalario(4789)
        victor.setDataAdmissao("12/06/2024")
        victor.setComissao(15.0)
        victor.setTotalFuncionario(10)

        txtNome.setText(victor.getNome())
        txtComissao.setText(victor.getComissao().toString())
        txtDataAdmissao.setText(victor.getDataAdmissao())
        txtSalario.setText(victor.getSalario().toString())
        txtTotalFuncionarios.setText(victor.getTotalFuncionarios().toString())
    }
}