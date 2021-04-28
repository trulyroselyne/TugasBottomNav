package com.example.tugasbottomnav;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    public final static String detailss = "VACATION_Details";
    private ImageView ivVacayPhoto;
    private TextView tvVacayPlaces;
    private TextView tvVacayDesc;
    private VacationModel vacationModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ivVacayPhoto = findViewById(R.id.ivDetail);
        tvVacayPlaces = findViewById(R.id.tvDetailName);
        tvVacayDesc = findViewById(R.id.tvDetailSum);



    }

    @Override
    protected void onStart(){
        super.onStart();
        vacationModel = getIntent().getParcelableExtra(detailss);
        tvVacayPlaces.setText(vacationModel.getName());
        ivVacayPhoto.setImageResource(vacationModel.getPhoto());
        tvVacayDesc.setText(vacationModel.getSummary());
        getSupportActionBar().setTitle(vacationModel.getName());

    }




}