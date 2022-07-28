package com.example.oyo_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        BottomNavigationView navigationView = findViewById(R.id.nav_view);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home_fragment, R.id.bookings_Fragment, R.id.offer_Fragment,R.id.invite_Fragment,R.id.help_Fragment)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.Frame_laout);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

//    home_fragment home_fragment = new home_fragment();
//    bookings_Fragment bookings_fragment = new bookings_Fragment();
//    offer_Fragment offer_fragment = new offer_Fragment();
//    invite_Fragment invite_fragment = new invite_Fragment();
//    help_Fragment help_fragment = new help_Fragment();
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.home_fragment:
//                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, home_fragment).commit();
//                return true;
//            case R.id.bookings_Fragment:
//                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, bookings_fragment).commit();
//                return true;
//            case R.id.offer_Fragment:
//                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, offer_fragment).commit();
//                return true;
//            case R.id.invite_Fragment:
//                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, invite_fragment).commit();
//                return true;
//            case R.id.help_Fragment:
//                getSupportFragmentManager().beginTransaction().replace(R.id.Frame_laout, help_fragment).commit();
//                return true;
//        }
//        return false;
//    }
}