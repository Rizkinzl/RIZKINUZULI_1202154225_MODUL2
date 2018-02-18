package com.example.rzknzl.rizkinuzuli_1202154225_modul2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;

/**
 * Created by RZKNZL on 17/02/2018.
 */

public class AdapterList extends BaseAdapter{

    Context context;
    String number[], name;
    LayoutInflater inflter;

    public AdapterList(Context applicationContext, String[] num, String n) {
        this.context = context;
        this.number = num;
        name = n;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_object, null);
        TextView no = (TextView) view.findViewById(R.id.textView);
        no.setText(number[i]);
        return view;
    }

}
