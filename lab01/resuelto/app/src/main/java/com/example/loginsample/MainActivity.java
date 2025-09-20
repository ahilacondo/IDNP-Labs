package com.example.loginsample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        EditText edtUsername = binding.edtUsername;
        EditText edtPassword = binding.edtPassword;
        Button btnLogin = binding.btnLogin;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUsername.getText().toString().equals("admin") && edtPassword.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Bienvenido a mi App", Toast.LENGTH_LONG).show();
                    Log.d(TAG, "Bienvenido a mi App");
                } else {
                    Toast.makeText(getApplicationContext(), "Error en la autenticacion", Toast.LENGTH_LONG).show();
                    Log.d(TAG, "Error en la autenticacion");
                }
            }
        });
    }
}
