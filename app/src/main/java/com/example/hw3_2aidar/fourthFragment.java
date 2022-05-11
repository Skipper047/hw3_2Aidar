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

public class fourthFragment extends Fragment {
    public static final String KEY_FOR_TEXT4= "key4";
    private TextView fourthText;
    private Button btnSend4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fourthText=view.findViewById(R.id.text_fourth);
        btnSend4=view.findViewById(R.id.btn_fourth);
        if (!getArguments().toString().isEmpty()){
            String val = getArguments().getString(thirdFragment.KEY_FOR_TEXT3);
            fourthText.setText(val);
        }
        btnSend4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString(KEY_FOR_TEXT4,fourthText.getText().toString());
                fifthFragment fragment = new fifthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
            }
        });
    }
}