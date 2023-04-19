package com.example.puppyportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,new Home_Fragment());
        fragmentTransaction.commit();

        bottom_nav = findViewById(R.id.bottonNav);

        bottom_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                switch (item.getItemId()){
                    case R.id.home:
                        fragmentTransaction.replace(R.id.container, new Home_Fragment());
                        break;
                    case R.id.gallery:
                        fragmentTransaction.replace(R.id.container, new Dogbook_Fragment());
                        break;
                    case R.id.add:
                        fragmentTransaction.replace(R.id.container, new Add_Fragment());
                        break;
                    case R.id.notification:
                        fragmentTransaction.replace(R.id.container, new Notification_Fragment());
                        break;
                    case R.id.profile:
                        fragmentTransaction.replace(R.id.container, new Profile_Fragment());
                        break;

                }
                fragmentTransaction.commit();
                return true;
            }
        });


    }
}