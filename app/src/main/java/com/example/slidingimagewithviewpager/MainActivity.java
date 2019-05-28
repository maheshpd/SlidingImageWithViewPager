package com.example.slidingimagewithviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPagerAdapter adapter;
    ViewPager viewPager;
    private String[] image = {
            "https://i.postimg.cc/6qHjTV1V/pani-puri.jpg",
            "https://i.postimg.cc/CMJ6vYLZ/sev-puri.jpg",
            "https://i.postimg.cc/nczSg5C3/bel-puri.jpg",
            "https://i.postimg.cc/rwG4JyM3/ragada-pattice.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(this, image);
        viewPager.setAdapter(adapter);
    }
}
