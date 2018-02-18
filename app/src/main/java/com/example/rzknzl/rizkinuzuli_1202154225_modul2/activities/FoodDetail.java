package com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;


public class FoodDetail extends AppCompatActivity {

    TextView tvFood, tvPrice;
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        Intent intent = getIntent();
        String food = intent.getStringExtra("textFood");
        Integer price = intent.getIntExtra("textPrice",0);
        Integer photo = intent.getIntExtra("textImage",0);

        Log.d("getIntExtra", ""+price+photo);

        tvFood = (TextView)findViewById(R.id.tvFood);
        tvPrice = (TextView)findViewById(R.id.tvPrice);
        ivImage = (ImageView)findViewById(R.id.ivImage);

        tvFood.setText(food);
        tvPrice.setText("Rp. "+price);
        ivImage.setImageResource(photo);

    }
}
