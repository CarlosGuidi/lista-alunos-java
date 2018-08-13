package br.com.industrialararaquara.listaalunos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"João", "Livia", "Roberclaúdio",
                "Cleidineia", "Raimundinha", "Livia", "Roberclaúdio", "Cleidineia",
                "Raimundinha", "Joquedezebe", "Kurtumegestre"};

        ListView listaAlunos = findViewById(R.id.lista_alunos);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        Button btnNovoAluno = findViewById(R.id.btn_novo_aluno);

        btnNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListaAlunosActivity.this, "Funcionou!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
