package com.example.trackfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        ImageView foodImageView = (ImageView) findViewById(R.id.foodImageView);
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);

        String titleExtra = intent.getStringExtra("EXTRA_NAME");
        String descriptionExtra = intent.getStringExtra("EXTRA_DESCRIPTION");
        int index = (intent.getIntExtra("EXTRA_IMAGE_ID", -1));

        titleTextView.setText(titleExtra);
        descriptionTextView.setText(descriptionExtra);
        if(!(index == -1)){
            foodImageView.setImageResource(index);
        }

    }

}
