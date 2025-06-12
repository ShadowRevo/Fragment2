package com.example.app541;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class HomeFrag extends Fragment {


    EditText EtUser;
    EditText EtPass;

    SharedPreferences sharedPref;

    public HomeFrag() {
        // Required empty public constructor
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        SharedPreferences sharedPref = getContext().getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("UserName", "Mohamed");
        editor.putString("password", "12345678");
        editor.commit();
        EtUser= view.findViewById(R.id.User);
        EtPass= view.findViewById(R.id.Pass);

        return view;
    }
//
    public void CheckUser(View view) {

    }


}