package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends LoginActivity {

    EditText CadastrarloginId, CadastrarEmailid, ConfirmarSenhaId, CadastrarsenhaId;
    Button idBtnCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cadastro);
        idBtnCadastrar = findViewById(R.id.idBtnCadastrar);
        CadastrarloginId = findViewById(R.id.CadastrarLoginId);
        CadastrarEmailid = findViewById(R.id.CadastrarEmailId);
        ConfirmarSenhaId = findViewById(R.id.ConfirmarSenhaId);
        CadastrarsenhaId = findViewById(R.id.CadastrarSenhaId);

        CadastrarloginId.setTextColor(getResources().getColor(R.color.white));
        CadastrarEmailid.setTextColor(getResources().getColor(R.color.white));
        ConfirmarSenhaId.setTextColor(getResources().getColor(R.color.white));
        CadastrarsenhaId.setTextColor(getResources().getColor(R.color.white));


        idBtnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, email, cadsenha, confirmarSenha;

                usuario = CadastrarloginId.getText().toString();
                email = CadastrarEmailid.getText().toString();
                cadsenha = CadastrarsenhaId.getText().toString();
                confirmarSenha = ConfirmarSenhaId.getText().toString();

                if (cadsenha.equals(confirmarSenha)) {
                    String senhaId = cadsenha;
                    String loginId = usuario;

                    Toast.makeText(getApplicationContext(),
                            "Cadastro Realizado!!!",
                            Toast.LENGTH_SHORT).show();
                    CadastrarloginId.setText("");
                    ConfirmarSenhaId.setText("");
                    CadastrarsenhaId.setText("");
                    CadastrarEmailid.setText("");

                } else {
                    Toast.makeText(getApplicationContext(),
                            "As senhas não são compatíveis!!!",
                            Toast.LENGTH_SHORT).show();
                    CadastrarloginId.setText("");
                    ConfirmarSenhaId.setText("");
                    CadastrarsenhaId.setText("");
                    CadastrarEmailid.setText("");
                    CadastrarloginId.requestFocus();
                }
            }
        });


    }


}