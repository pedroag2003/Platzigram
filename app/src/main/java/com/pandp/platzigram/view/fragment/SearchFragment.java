package com.pandp.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pandp.platzigram.R;
import com.pandp.platzigram.adapter.PictureAdapterRecyclerView;
import com.pandp.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchFragment);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return  view;
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg", "Urie Ramirez", "4 dias", "3 Me Gusta"));
        pictures.add(new Picture("http://s3-us-west-2.amazonaws.com/fahrenheit/wp-content/uploads/2016/04/01133749/las-5-ciudades-mas-populares-cine-RS.jpg", "Juan pablo", "3 dias", "10  Me Gusta"));
        pictures.add(new Picture("http://javitour.com/wp-content/uploads/2016/04/ciudades-de-Estados-Unidos-21_opt.jpg", "Pedro alvarado", "2 dias", "9 Me Gusta"));
        return pictures;
    }

}
