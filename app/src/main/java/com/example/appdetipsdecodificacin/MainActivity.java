package com.example.appdetipsdecodificacin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TipAdapter tipAdapter;
    private List<Tip> tipList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tipList = new ArrayList<>();
        tipAdapter = new TipAdapter(this,
                tipList);
        recyclerView.setAdapter(tipAdapter);

        // Aquí deberías cargar los tips de la base de datos y agregarlos a tipList
    }

    // Método para agregar un nuevo tip
    public void addTip(Tip tip) {
        tipList.add(tip);
        tipAdapter.notifyDataSetChanged();
    }
}
