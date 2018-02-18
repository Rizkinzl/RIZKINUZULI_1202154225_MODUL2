package com.example.rzknzl.rizkinuzuli_1202154225_modul2.adapters;

/**
 * Created by RZKNZL on 17/02/2018.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.R;
import com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities.FoodDetail;

import java.util.LinkedList;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder>{

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private final LinkedList<String> listFood;
    private final LinkedList<Integer> listPrice;
    private final LinkedList<Integer> listImage;
    private LayoutInflater inflater;

    // Constructor of the class
    public ItemArrayAdapter(Context context, LinkedList<String> food, LinkedList<Integer> price, LinkedList<Integer> image) {
        inflater = LayoutInflater.from(context);
        this.listFood = food;
        this.listPrice = price;
        this.listImage = image;
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    // specify the row layout file and click for each row
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = inflater.inflate(R.layout.activity_list_item, parent, false);
        return new ViewHolder(mItemView, this);
    }

    // load data in each row element
    public void onBindViewHolder(ViewHolder holder, int listPosition) {
        String onFood = listFood.get(listPosition);
        Integer onPrice = listPrice.get(listPosition);
        Integer onImage = listImage.get(listPosition);
        holder.foodItem.setText(onFood);
        holder.priceItem.setText("Rp. "+onPrice.toString());
        holder.imageItem.setImageResource(onImage);
    }

    // Static inner class to initialize the views of rows
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView foodItem;
        public final TextView priceItem;
        public final ImageView imageItem;
        public final LinearLayout linLayout;

        final ItemArrayAdapter adapter;
        public ViewHolder(final View itemView, ItemArrayAdapter adapterPar) {
            super(itemView);
            foodItem = (TextView) itemView.findViewById(R.id.menulist_nama);
            priceItem = (TextView) itemView.findViewById(R.id.menulist_harga);
            imageItem = (ImageView) itemView.findViewById(R.id.menulist_logo);
            linLayout = (LinearLayout) itemView.findViewById(R.id.Layout);
            linLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();

                    String txFood = listFood.get(position);
                    Integer txPrice = listPrice.get(position);
                    Integer txImage = listImage.get(position);

                    Intent intent = new Intent(itemView.getContext(), FoodDetail.class);
                    intent.putExtra("textFood", txFood);
                    intent.putExtra("textPrice", txPrice);
                    intent.putExtra("textImage", txImage);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.adapter = adapterPar;
        }

        @Override
        public void onClick(View view) {

        }
    }
}
