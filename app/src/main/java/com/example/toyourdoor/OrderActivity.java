package com.example.toyourdoor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.toyourdoor.adapters.OrderAdapters;
import com.example.toyourdoor.databinding.ActivityOrderBinding;
import com.example.toyourdoor.models.OrdersModel;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));
        list.add(new OrdersModel(R.drawable.burger,"Burger","123456789","150"));

        OrderAdapters adapters= new OrderAdapters(list,this);
        binding.orderRecycleView.setAdapter(adapters);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecycleView.setLayoutManager(layoutManager);




    }
}