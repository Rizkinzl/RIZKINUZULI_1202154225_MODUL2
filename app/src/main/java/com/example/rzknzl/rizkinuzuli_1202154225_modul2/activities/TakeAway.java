package com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.picker.DatePicker;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.picker.TimePicker;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void chooseDate(View view) {
        DatePicker newFragment = new DatePicker();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_str));
    }

    public void chooseTime(View view) {
        TimePicker newFragment = new TimePicker();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_str));
    }

    public void pilihpesan(View view) {
        Intent in = new Intent(TakeAway.this, MenuList.class);
        startActivity(in);
    }
}
