package com.example.hw3_2aidar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class fifthFragment extends Fragment {
    private TextView fifthText;
    private Button btnSend5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fifthText=view.findViewById(R.id.text_fifth);
        btnSend5=view.findViewById(R.id.btn_fifth);
        if (!getArguments().toString().isEmpty()){
            String val = getArguments().getString(fourthFragment.KEY_FOR_TEXT4);
            fifthText.setText(val);
        }
    }
}