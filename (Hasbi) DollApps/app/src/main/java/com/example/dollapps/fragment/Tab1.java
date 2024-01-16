package com.example.dollapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.dollapps.R;
import com.example.dollapps.fragment.sinopsis.SinopsisThriller1;
import com.example.dollapps.fragment.sinopsis.SinopsisThriller2;

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ImageView imageView = view.findViewById(R.id.thriller1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisThriller1.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = view.findViewById(R.id.thriller2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisThriller2.class);
                startActivity(intent);

            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}

