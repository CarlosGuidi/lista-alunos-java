package br.com.industrialararaquara.listaalunos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btnSalvar = findViewById(R.id.btn_salvar);
        EditText nome = findViewById(R.id.nome);
        EditText endereco = findViewById(R.id.endereco);
        EditText site = findViewById(R.id.site);
        RatingBar nota = findViewById(R.id.nota);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormularioActivity.this, "Cliquei no botão",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}
