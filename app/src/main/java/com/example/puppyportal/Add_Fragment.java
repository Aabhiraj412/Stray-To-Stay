package com.example.puppyportal;

import static android.app.Activity.RESULT_OK;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Add_Fragment extends Fragment {
    public Add_Fragment() {
        // Required empty public constructor
    }

    Button camera, open_gallery,submit, location_btn, emergency;
    ImageView upload_image;

    EditText location, description;
    private final int GALLERY_REQ_CODE = 1000;
    private final int CAMERA_REQ_CODE = 100;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_, container, false);
        camera = view.findViewById(R.id.camera);
        open_gallery = view.findViewById(R.id.open_gallerery);
        submit = view.findViewById(R.id.submit);
        location_btn = view.findViewById(R.id.location_btn);
        upload_image = view.findViewById(R.id.upload_image);
        emergency = view.findViewById(R.id.emergency);

        location = view.findViewById(R.id.location_fil);
        description = view.findViewById(R.id.disc);

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Doctor_Activity.class);
                startActivity(intent);
            }
        });
        
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Location is Uploaded", Toast.LENGTH_SHORT).show();
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQ_CODE);

            }
        });

        open_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent(Intent.ACTION_PICK);

                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(iGallery, GALLERY_REQ_CODE);

            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = location.getText().toString();
                String disc = description.getText().toString();

                if (loc.isEmpty()){
                    location.setError("This field is required");
                } else if (disc.isEmpty()) {
                    description.setError("This Field is Required");
                }else {
                    Toast.makeText(getContext(), "Uploaded Successfully", Toast.LENGTH_SHORT).show();

                }

            }
        });

        
        return view;

      }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode==RESULT_OK){
            if (requestCode==GALLERY_REQ_CODE){
                upload_image.setImageURI(data.getData());
            } else if (requestCode==CAMERA_REQ_CODE) {
                Bitmap img = (Bitmap) (data.getExtras().get("data"));
                upload_image.setImageBitmap(img);
            }
        }
    }
}