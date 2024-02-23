package com.example.appdetipsdecodificacin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewTipActivity extends AppCompatActivity {
    private EditText editTextContent, editTextAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tip);

        editTextContent = findViewById(R.id.editTextContent);
        editTextAuthor = findViewById(R.id.editTextAuthor);
    }

    public void submitTip(View view) {
        String content = editTextContent.getText().toString().trim();
        String author = editTextAuthor.getText().toString().trim();
        // Verificar si el contenido y el autor no están vacíos
        if (!TextUtils.isEmpty(content) && !TextUtils.isEmpty(author)) {
            // Crear un nuevo tip y agregarlo a la base de datos
            Tip tip = new Tip(content, author, 0);
            // Aquí deberías agregar el nuevo tip a la base de datos y a la lista de tips en MainActivity
            // MainActivity.addTip(tip);
            finish();
        } else {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        }
    }
}
