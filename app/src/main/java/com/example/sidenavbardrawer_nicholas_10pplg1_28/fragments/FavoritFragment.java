package com.example.sidenavbardrawer_nicholas_10pplg1_28.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.sidenavbardrawer_nicholas_10pplg1_28.R;

public class FavoritFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorit, container, false);
        return rootView;
    }
}