package com.example.v2g;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.v2g.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;


public class MainActivity extends AppCompatActivity {


        final FragmentManager fragmentManager = getSupportFragmentManager();
        private BottomNavigationView bottomNavigationView;



    private Button Loginbutton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Loginbutton = (Button) findViewById(R.id.Loginbutton);


            Loginbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            });


            bottomNavigationView = findViewById(R.id.bottomNavigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment fragment;
                    switch (menuItem.getItemId()) {
                        case R.id.navigation_home:
                            fragment = new HomeFragment();
                            break;
                        case R.id.navigation_cart:
                            fragment = new CartFragment();
                            break;
                        default:
                            fragment = new ProfileFragment();
                            break;
                    }
                    fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
                    return true;
                }
            });
            // Set default selection
            bottomNavigationView.setSelectedItemId(R.id.navigation_home);



        }
/*
    private void MainActivity2()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

 */


}

