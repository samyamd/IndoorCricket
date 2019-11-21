package com.samyam.indoorcricket.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.samyam.indoorcricket.R;

public class RegisterFragment extends Fragment {
    private EditText un, pwd , conpwd,phone,dob,gender;
    private Button save;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        un = view.findViewById(R.id.reg_name);
        phone = view.findViewById(R.id.reg_phone);
        dob = view.findViewById(R.id.reg_dob);

        pwd = view.findViewById(R.id.reg_password);
        conpwd = view.findViewById(R.id.reg_con_password);

        save = view.findViewById(R.id.reg_submit);

        return view;
    }

    public void Clear(){
        un.setText("");
        pwd.setText("");
        conpwd.setText("");
    }

}
