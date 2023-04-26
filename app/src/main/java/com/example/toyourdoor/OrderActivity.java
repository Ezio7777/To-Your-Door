package com.example.toyourdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toyourdoor.databinding.ActivityOrderBinding;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}