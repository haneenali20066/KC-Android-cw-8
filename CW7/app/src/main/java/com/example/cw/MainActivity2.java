package com.example.cw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView thefood = findViewById(R.id.imageView2);
        TextView thetype = findViewById(R.id.textView3);


        Bundle b = getIntent().getExtras();

        TextView foodname = findViewById(R.id.foodnametxt);
        TextView foodprice = findViewById(R.id.textView2);
        ImageView foodImage = findViewById(R.id.imageView);

        Food dfood = (Food) b.getSerializable("food");

        foodname.setText(dfood.getFoodName());
        foodprice.setText(dfood.getFoodPrice());
        foodImage.setImageResource(dfood.setFoodImage());



    }
}