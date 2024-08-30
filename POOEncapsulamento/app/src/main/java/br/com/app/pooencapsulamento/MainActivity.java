package br.com.app.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtTituloLivro;
    private TextView txtAutor;
    private TextView txtEditora;
    private TextView txtPaginas;
    private TextView txtLocalizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        iniciarComponentesDoLayout();

        criarObjetos();
    }

    private void iniciarComponentesDoLayout() {
        txtAutor = findViewById(R.id.txtAutor);
        txtTituloLivro = findViewById(R.id.txtTituloLivro);
        txtEditora = findViewById(R.id.txtEditora);
        txtPaginas = findViewById(R.id.txtPaginas);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);
    }

    public void criarObjetos() {
        Livro livro = new Livro()
        livro.setTitulo("O poder da paciência");
        livro.setAutor("Mary Jane Ryan");
        livro.setEditora("L.S Lakers");
        livro.setPaginas(110);
        livro.setLocalizacao("Nova York");

        Log.i("Livro ", "Obj Livro: Titulo, "+ livro.getTitulo());
        Log.i("Livro ", "Obj Livro: Autor, "+ livro.getAutor());
        Log.i("Livro ", "Obj Livro: Editora, "+ livro.getEditora());
        Log.i("Livro ", "Obj Livro: Paginas, "+ livro.getPaginas());
        Log.i("Livro ", "Obj Livro: Localização, "+ livro.getLocalizacao());

        txtAutor.setText(livro.getAutor());
        txtTituloLivro.setText(livro.getTitulo());
        txtEditora.setText(livro.getEditora());
        txtPaginas.setText(livro.getPaginas()+"");
        txtLocalizacao.setText(livro.getLocalizacao());
    }
}