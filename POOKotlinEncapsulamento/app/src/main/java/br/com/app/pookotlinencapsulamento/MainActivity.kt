package br.com.app.pookotlinencapsulamento

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtTitulo: TextView
    lateinit var txtAutor: TextView
    lateinit var txtLocalizacao: TextView
    lateinit var txtEditora: TextView
    lateinit var txtPaginas: TextView

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
    }

    private fun iniciarComponentesDoLayout() {
        txtTitulo = findViewById(R.id.txtTituloLivro)
        txtAutor = findViewById(R.id.txtAutor)
        txtLocalizacao = findViewById(R.id.txtLocalizacao)
        txtEditora = findViewById(R.id.txtEditora)
        txtPaginas = findViewById(R.id.txtPaginas)
    }

    private fun criarObjetos() {
        var livro = Livro("O poder da paciência", "Mary Jane Ryan", "Nova York",
            "L.S Lakers", 110)

        txtTitulo.setText(livro.titulo)
        txtAutor.setText(livro.autor)
        txtLocalizacao.setText(livro.localizacao)
        txtEditora.setText(livro.editora)
        txtPaginas.setText(livro.paginas.toString())
    }
}