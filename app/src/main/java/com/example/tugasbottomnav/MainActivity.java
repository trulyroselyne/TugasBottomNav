package com.example.tugasbottomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private Map<Integer, Fragment> fragmentMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        fragmentMap = new HashMap<>();
    }

    @Override
    protected void onStart() {
        super.onStart();
        fragmentMap.put(R.id.menu_places, PlacesFragment.newInstance());
        fragmentMap.put(R.id.menu_details, DetailsFragment.newInstance());
        fragmentMap.put(R.id.menu_favourite, FavouriteFragment.newInstance());
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.menu_places);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = fragmentMap.get(item.getItemId());
        assert fragment != null;
        switch (item.getItemId()){
            case R.id.menu_places:
                setActionBarTitle("Places");
                break;
            case R.id.menu_details:
                setActionBarTitle("Details");
                break;
            case R.id.menu_favourite:
                setActionBarTitle("Favourite");
                break;
        }
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
        return true;
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bottom_nav_item, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.menu_places){
//            Intent a = new Intent(MainActivity.this, PlacesFragment.class);
//            startActivity(a);
//        } else if(id == R.id.menu_details){
//            Intent b = new Intent(MainActivity.this, DetailsFragment.class);
//            startActivity(b);
//        } else if (id == R.id.menu_favourite) {
//            Intent c = new Intent(MainActivity.this, FavouriteFragment.class);
//            startActivity(c);
//
//            finish();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
