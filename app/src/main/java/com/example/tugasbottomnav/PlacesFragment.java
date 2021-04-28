package com.example.tugasbottomnav;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

public class PlacesFragment extends Fragment implements OnItemClickListener<VacationModel> {
    private RecyclerView rvPlaces;
    private VacationAdapter adapter;

    public static PlacesFragment newInstance() {
        PlacesFragment fragment = new PlacesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);
        rvPlaces = rootView.findViewById(R.id.rv_places);
        adapter = new VacationAdapter();
        adapter.setVacation(VacationDatabase.getListData());
        rvPlaces.setLayoutManager((new LinearLayoutManager(getActivity())));
        rvPlaces.setHasFixedSize(true);
        adapter.setClickListener(this);
        rvPlaces.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onClick(VacationModel vacationModel) {
        Intent a = new Intent(getActivity(), Details.class);
        a.putExtra(Details.detailss, vacationModel);
        startActivity(a);
    }
}