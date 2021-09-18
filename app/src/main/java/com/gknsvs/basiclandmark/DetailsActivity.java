package com.gknsvs.basiclandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gknsvs.basiclandmark.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        Landmark selectedLandmark;
        Intent intent=getIntent();
        selectedLandmark= (Landmark) intent.getSerializableExtra("landmark");

        binding.imageView.setImageResource(selectedLandmark.image);
        binding.txtCountry.setText(selectedLandmark.name);
        binding.txtInfo.setText(selectedLandmark.info);
    }
}