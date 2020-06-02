package com.intcce.pocketbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity {

    PageCurlView pageCurlView;
    List<Integer> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //pagecurl
        pageCurlView =findViewById(R.id.pagecurlView);
        images=new ArrayList<>();
        images.add(R.drawable.sociallawa);
        images.add(R.drawable.sociallawb);
        images.add(R.drawable.sociallawc);
        pageCurlView.setCurlView(images);
        pageCurlView.setCurlSpeed(600);



    }


}

