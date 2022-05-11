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


public class secondFragment extends Fragment {
    public static final String KEY_FOR_TEXT2= "key2";
    private TextView secondText;
    private Button btnSend2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        secondText=view.findViewById(R.id.text_second);
        btnSend2=view.findViewById(R.id.btn_second);
        if (!getArguments().toString().isEmpty()){
            String val = getArguments().getString(mainFragment.KEY_FOR_TEXT);
            secondText.setText(val);
        }
        btnSend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_FOR_TEXT2,secondText.getText().toString());
                thirdFragment fragment = new thirdFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
            }
        });
    }
}