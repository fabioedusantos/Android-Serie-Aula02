package br.fabio.professor.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText txtNome;
    private EditText txtTelefone;
    private EditText txtSenha;
    private RadioGroup grupoSexo;
    private int selRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Exemplo de comunicação entre Activitys");

        txtNome = (EditText) findViewById(R.id.txtNome);
        txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        grupoSexo = (RadioGroup) findViewById(R.id.grupoSexo);
        selRadio = R.id.rdIndefinido;

        grupoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selRadio = checkedId;
            }
        });
    }

    public void salvar(View v){
        String nome = txtNome.getText().toString();
        String telefone = txtTelefone.getText().toString();
        String senha = txtSenha.getText().toString();
        RadioButton rdSelecionado = (RadioButton) findViewById(selRadio);
        String sexo = rdSelecionado.getText().toString();

        Intent i = new Intent(MainActivity.this, ExibirActivity.class);
        i.putExtra("nome", nome);
        i.putExtra("telefone", telefone);
        i.putExtra("senha", senha);
        i.putExtra("sexo", sexo);
        startActivity(i);
    }


}
