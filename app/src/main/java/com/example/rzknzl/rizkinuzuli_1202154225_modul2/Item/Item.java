package com.example.rzknzl.rizkinuzuli_1202154225_modul2.Item;

/**
 * Created by RZKNZL on 17/02/2018.
 */

public class Item {

    private String name, name1;
    private int imageId;

    public Item(String n, String m, int o) {
        this.name = n;
        this.name1 = m;
        this.imageId = o;

    }
    public String getName1() {
        return name;
    }
    public String getName2() {
        return name1;
    }
    public int getImage(){
        return imageId;
    }

}