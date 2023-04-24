package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText loginId, senhaId;
    TextView cadastroId;
    Button idBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        loginId = findViewById(R.id.LoginId);
        senhaId = findViewById(R.id.SenhaId);
        idBtnLogin = findViewById(R.id.idBtnLogin);
        cadastroId = findViewById(R.id.cadastrarId);

        loginId.setTextColor(getResources().getColor(R.color.white));
        senhaId.setTextColor(getResources().getColor(R.color.white));



    cadastroId.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(getApplicationContext(),
                    CadastroActivity.class));
            finish();
        }
    });
    idBtnLogin.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            String usuario, senha;

            usuario = loginId.getText().toString();
            senha = senhaId.getText().toString();

            if (usuario.equals("laercio") && senha.equals("laercioteamo")) {
                startActivity(new Intent(getApplicationContext(),
                        MenuActivity.class));
                finish();



            } else {
                Toast.makeText(getApplicationContext(),
                        "Usuário ou senha inválidos!!!",
                        Toast.LENGTH_SHORT).show();
                loginId.setText("");
                senhaId.setText("");
                loginId.requestFocus();
            }

        }
    });
}
}