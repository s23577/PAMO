package com.example.a01_bmi_calculator;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.shopping_list_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        backHome(toolbar);

        List<String> itemList = new ArrayList<>();
        itemList.add("2 Jajka");
        itemList.add("1 Papryka");
        itemList.add("2 Pomidory");
        itemList.add("1 Cebula");
        itemList.add("1 Szpinak");
        itemList.add("Sól");
        itemList.add("Pieprz");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ShoppingListAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }

    private void backHome(androidx.appcompat.widget.Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
