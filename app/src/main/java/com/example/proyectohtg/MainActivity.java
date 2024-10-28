package com.example.proyectohtg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextContraseña;
    private Button buttonIngresar;

    private static final String USUARIO_CORRECTO = "Camilo16"; // Cambia esto por el usuario correcto
    private static final String CONTRASENA_CORRECTA = "Cam1609"; // Cambia esto por la contraseña correcta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextContraseña = findViewById(R.id.editTextContraseña);
        buttonIngresar = findViewById(R.id.buttonIngresar);

        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String contraseña = editTextContraseña.getText().toString();

                // Verificar si el usuario y la contraseña son correctos
                if (usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASENA_CORRECTA)) {
                    // Iniciar la nueva actividad
                    Intent intent = new Intent(MainActivity.this, MainPageActivity.class);
                    startActivity(intent);
                    finish(); // Opcional: cierra la actividad de inicio de sesión
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}