package br.com.app.pooheranca;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtSalario;
    private TextView txtDataAdmissao;
    private TextView txtComissao;
    private TextView txtTotalFuncionarios;


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

        criarObjeto();

        Funcionario joao = new Funcionario();

    }

    private void criarObjeto() {
        Gerente pedro = new Gerente();

        pedro.setNome("Pedro");
        pedro.setDataAdmissao("01/02/2024");
        pedro.setSalario(2000.04);
        pedro.setComissao(15);
        pedro.setTotalFuncionarios(10);

        txtNome.setText(pedro.getNome());
        txtComissao.setText(String.valueOf(pedro.getComissao()));
        txtSalario.setText(String.valueOf(pedro.getSalario()));
        txtDataAdmissao.setText(pedro.getDataAdmissao());
        txtTotalFuncionarios.setText(String.valueOf(pedro.getTotalFuncionarios()));
    }

    private void iniciarComponentesDoLayout() {
        txtNome = findViewById(R.id.txtNome);
        txtComissao = findViewById(R.id.txtComissao);
        txtSalario = findViewById(R.id.txtSalario);
        txtDataAdmissao = findViewById(R.id.txtDataAdmissao);
        txtTotalFuncionarios = findViewById(R.id.txtTotalFuncionarios);
    }
}