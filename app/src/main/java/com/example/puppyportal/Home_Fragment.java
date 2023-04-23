package com.example.puppyportal;

import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class Home_Fragment extends Fragment {

    LinearLayout dog_1,dog_2,dog_3,cow_1,cow_2,cow_3,cat_1,cat_2,cat_3;

    TextView loc_test, disc_test;
    public Home_Fragment() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        loc_test = view.findViewById(R.id.loc_test);
        disc_test = view.findViewById(R.id.disc_test);
        dog_1 = view.findViewById(R.id.dog_1);
        dog_2 = view.findViewById(R.id.dog_2);
        dog_3 = view.findViewById(R.id.dog_3);
        cow_1 = view.findViewById(R.id.cow_1);
        cow_2 = view.findViewById(R.id.cow_2);
        cow_3 = view.findViewById(R.id.cow_3);
        cat_1 = view.findViewById(R.id.cat_1);
        cat_2 = view.findViewById(R.id.cat_2);
        cat_3 = view.findViewById(R.id.cat_3);



        dog_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Dog_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cow_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cow_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cat_Detail_Activity.class);
                startActivity(intent);
            }
        });

        dog_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Dog_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cow_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cat_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cat_Detail_Activity.class);
                startActivity(intent);
            }
        });
        dog_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Dog_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cow_Detail_Activity.class);
                startActivity(intent);
            }
        });

        cat_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                  Toast.makeText(getContext(), "LinearLayout clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), Cat_Detail_Activity.class);
                startActivity(intent);
            }
        });
        return view;
     }


}