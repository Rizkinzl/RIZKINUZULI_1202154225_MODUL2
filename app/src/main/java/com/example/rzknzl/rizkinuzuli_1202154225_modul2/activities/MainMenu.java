package com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.MainActivity;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;

public class MainMenu extends AppCompatActivity {

    private boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void orderNow(View view){

        if(check){  //kondisi dimana ketika mencheck Dine In
            Intent in = new Intent(this, DineIn.class);
            startActivity(in);
            Toast.makeText(MainMenu.this, "Dine In", Toast.LENGTH_LONG).show();
        } else{     //kondisi dimana ketika mencheck Take Away
            Intent in = new Intent(this, TakeAway.class);
            startActivity(in);
            Toast.makeText(MainMenu.this, "Take Away", Toast.LENGTH_LONG).show();
        }

    }

    public void radioClick(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.rbdine:
                if(checked)
                    check = true;
                break;
            case R.id.rbtake:
                if(checked)
                    check = false;
                break;
        }
    }
}
