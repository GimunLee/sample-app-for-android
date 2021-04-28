package com.example.fossa_gradle_test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(){
        Picasso.get();
    }
}
