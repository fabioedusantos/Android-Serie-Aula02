package br.fabio.professor.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExibirActivity extends AppCompatActivity {

    private TextView txvNome;
    private TextView txvTelefone;
    private TextView txvSenha;
    private TextView txvSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir);

        setTitle("Recebendo dados da Activity Anterior");

        txvNome = (TextView) findViewById(R.id.txvNome);
        txvTelefone = (TextView) findViewById(R.id.txvTelefone);
        txvSenha = (TextView) findViewById(R.id.txvSenha);
        txvSexo = (TextView) findViewById(R.id.txvSexo);

        Bundle extras = getIntent().getExtras();
        String nome = extras.getString("nome");
        String telefone = extras.getString("telefone");
        String senha = extras.getString("senha");
        String sexo = extras.getString("sexo");

        txvNome.setText(nome);
        txvTelefone.setText(telefone);
        txvSenha.setText(senha);
        txvSexo.setText(sexo);
    }

    public void sair(View v){
        finish();
    }
}
