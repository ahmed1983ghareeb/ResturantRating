package com.example.resturantrating;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import model.Rating;

public class Client extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Button btnFinish, btnSave;
    String mealName;
    float mealRate;
    Spinner mealSpinner;
    ImageView mealImageView;


    ArrayList<Rating> ratingList = new ArrayList<Rating>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        initialize();
    }

    private void initialize() {
        btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(this);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        mealSpinner = findViewById(R.id.spinnerMeal);
        mealSpinner.setOnItemSelectedListener(this);
        mealImageView = findViewById(R.id.imageView);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myData = (TextView)view;
        switch (myData.getText().toString()){
            case "Burger":
                mealImageView.setImageResource(R.drawable.burger);
                break;
            case "Pizza":
                mealImageView.setImageResource(R.drawable.pizza);
                break;
            case "Wrap":
                mealImageView.setImageResource(R.drawable.wrap);
                break;
            case "Fried chicken":
                mealImageView.setImageResource(R.drawable.chiken);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
    switch (v.getId()) {
        case R.id.btnSave:
            ratingList.add(new Rating(mealName, mealRate));
            break;
        case R.id.btnFinish:
            finish();
            break;
    }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Intent intent;


    }
}
