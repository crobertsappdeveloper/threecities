package com.example.android.threecities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.threecities.R.id.city_image_view;
import static com.example.android.threecities.R.id.city_text_view;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void HongKong(View view) {
        ImageView cityImage = (ImageView) findViewById(city_image_view);
        cityImage.setImageResource(R.drawable.hong_kong);
        TextView cityText = (TextView) findViewById(city_text_view);
        cityText.setText("Hong Kong");
    }

    public void London(View view) {
        ImageView cityImage = (ImageView) findViewById(city_image_view);
        cityImage.setImageResource(R.drawable.london);
        TextView cityText = (TextView) findViewById(city_text_view);
        cityText.setText("London");
    }

    public void Bangkok(View view) {
        ImageView cityImage = (ImageView) findViewById(city_image_view);
        cityImage.setImageResource(R.drawable.bangkok);
        TextView cityText = (TextView) findViewById(city_text_view);
        cityText.setText("Bangkok");
    }
}
