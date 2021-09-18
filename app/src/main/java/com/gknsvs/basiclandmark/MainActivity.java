package com.gknsvs.basiclandmark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.gknsvs.basiclandmark.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        ArrayList<Landmark> landmarks=new ArrayList<>();

        //Data
        landmarks.add(new Landmark("Eiffel","in France",R.drawable.eiffel));
        landmarks.add(new Landmark("Siegessäule","in Germany",R.drawable.sieges));
        landmarks.add(new Landmark("Anıtkabir","in Turkey",R.drawable.anitkabir));


        binding.recylerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarks);
        binding.recylerView.setAdapter(landmarkAdapter);
    }
}