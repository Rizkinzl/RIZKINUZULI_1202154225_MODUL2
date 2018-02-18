package com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.adapters.ItemArrayAdapter;
import java.util.LinkedList;

public class MenuList extends AppCompatActivity {

    private final LinkedList<String> food = new LinkedList<>();
    private final LinkedList<Integer> price = new LinkedList<>();
    private final LinkedList<Integer> image = new LinkedList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        // Initializing list view with the custom adapter

        for (int i = 0;i < 1; i++) {
            food.add("Sushi Roll");
            food.add("Sushi Box");
            food.add("Chicken Katsu");
            food.add("Katsudon");
            food.add("Okonomiyaki");
            food.add("Omurice");
            food.add("Rice Kare");
            food.add("Sashimi");
            food.add("Takoyaki");
            food.add("Tepanyaki");
            food.add("Beef Teriyaki");
            food.add("Udon");
            food.add("Yakisoba");

            price.add(35000);
            price.add(35000);
            price.add(25999);
            price.add(38599);
            price.add(1800);
            price.add(22000);
            price.add(24000);
            price.add(62000);
            price.add(18799);
            price.add(54000);
            price.add(42000);
            price.add(27000);
            price.add(25000);

            image.add(R.drawable.sushiroll);
            image.add(R.drawable.sushibox);
            image.add(R.drawable.chickenkatsu);
            image.add(R.drawable.katsudon);
            image.add(R.drawable.okonomiyaki);
            image.add(R.drawable.omurice);
            image.add(R.drawable.ricekare);
            image.add(R.drawable.sashimi);
            image.add(R.drawable.takoyaki);
            image.add(R.drawable.teppanyaki);
            image.add(R.drawable.teriyakibeef);
            image.add(R.drawable.udon);
            image.add(R.drawable.yakisoba);

        }

        ItemArrayAdapter adapter = new ItemArrayAdapter(this, food, price, image);
        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

}