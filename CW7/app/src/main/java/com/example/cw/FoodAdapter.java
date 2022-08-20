package com.example.cw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {

    List<Food> foodlist;

    public FoodAdapter(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);


        foodlist = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_row , parent , false);

        Food currentFood = foodlist.get(position);

        TextView foodname = v.findViewById(R.id.foodnametxt);
        TextView foodprice = v.findViewById(R.id.textView2);
        ImageView foodImage = v.findViewById(R.id.imageView);

        foodname.setText(currentFood.getFoodName());
        foodprice.setText(currentFood.getFoodPrice());
        foodImage.setImageResource(currentFood.setFoodImage());


        ImageView delete = v.findViewById(R.id.textView3);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodlist.remove(position);
            }
        });



        return v;
    }
}


