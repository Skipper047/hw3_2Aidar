package com.example.hw3_2aidar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mainFragment extends Fragment {
    public static final String KEY_FOR_TEXT= "key1";
    private EditText firstText;
    private Button btnSend;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstText=view.findViewById(R.id.edit_first);
        btnSend=view.findViewById(R.id.btn_first);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!firstText.getText().toString().isEmpty()){
                    Bundle bundle = new Bundle();
                    bundle.putString(KEY_FOR_TEXT,firstText.getText().toString());
                    secondFragment fragment = new secondFragment();
                    fragment.setArguments(bundle);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
                }else {
                    Toast.makeText(getActivity(),"Введите текст",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}