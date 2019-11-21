package com.samyam.indoorcricket.fragments;

import android.content.Context;
import android.content.Intent;
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

public class LoginFragment extends Fragment {
    EditText username, password;
    Button login;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        username = view.findViewById(R.id.login_username);
        password = view.findViewById(R.id.login_password);
        login = view.findViewById(R.id.login_submit);

        return view;
    }

}
