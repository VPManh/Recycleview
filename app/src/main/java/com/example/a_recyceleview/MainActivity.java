package com.example.a_recyceleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcyCatalog ;
    private ArrayList<Catalog> catalogArrayList;
    private ArrayList<Book> bookArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        CatalogAdapter catalogAdapter  = new CatalogAdapter(this,catalogArrayList);
        rcyCatalog.setAdapter(catalogAdapter);

    }

    private void AnhXa() {
        rcyCatalog = findViewById(R.id.cycleview);
        catalogArrayList = new ArrayList<>();

        bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book(R.drawable.book3,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book4,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book5,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book3,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book3,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book4,"Name 1","Mo ta 1"));
        bookArrayList.add(new Book(R.drawable.book5,"Name 1","Mo ta 1"));

        catalogArrayList.add(new Catalog("Catalog 1",bookArrayList));
        catalogArrayList.add(new Catalog("Catalog 1",bookArrayList));
        catalogArrayList.add(new Catalog("Catalog 1",bookArrayList));
        catalogArrayList.add(new Catalog("Catalog 1",bookArrayList));
        catalogArrayList.add(new Catalog("Catalog 1",bookArrayList));



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcyCatalog.setLayoutManager(linearLayoutManager);





    }
}