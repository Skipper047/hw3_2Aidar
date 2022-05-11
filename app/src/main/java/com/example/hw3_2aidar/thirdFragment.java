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

public class thirdFragment extends Fragment {
    public static final String KEY_FOR_TEXT3= "key3";
    private TextView thirdText;
    private Button btnSend3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        thirdText=view.findViewById(R.id.text_third);
        btnSend3=view.findViewById(R.id.btn_third);
        if (!getArguments().toString().isEmpty()){
            String val = getArguments().getString(secondFragment.KEY_FOR_TEXT2);
            thirdText.setText(val);
        }
        btnSend3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_FOR_TEXT3,thirdText.getText().toString());
                fourthFragment fragment = new fourthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
            }
        });
    }
}