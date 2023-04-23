package com.example.toyourdoor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.toyourdoor.adapters.MainAdapter;
import com.example.toyourdoor.databinding.ActivityMainBinding;
import com.example.toyourdoor.models.MainModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger,"Burger","150","Juicy chicken, BBQ sauce on soft bun. Satisfying."));
        list.add(new MainModel(R.drawable.pizza,"Pizza","300","Thin crust, tomato sauce, fresh mozzarella, basil. Classic Italian."));
        list.add(new MainModel(R.drawable.juice,"Juice","100","Lemon Juice With Water Mellon."));
        list.add(new MainModel(R.drawable.fries,"French Fries","200","French fries, chips, finger chips, french-fried potatoes, or simply fries."));
        list.add(new MainModel(R.drawable.chow,"Chow Mein","125","Stir-fried noodles, veggies, and meat in soy sauce."));
        list.add(new MainModel(R.drawable.pasta,"Pasta","175","Spaghetti, egg sauce, bacon, parmesan cheese. Comforting Italian classic."));
        list.add(new MainModel(R.drawable.eggroll,"Egg Roll","100","Crispy fried wrapper, cabbage, carrots. Chinese appetizer classic."));
        list.add(new MainModel(R.drawable.cutlet,"Cutlet","200","Tender chicken, crispy breadcrumbs, herbs, spices. Served with sauce."));


        MainAdapter adapter = new MainAdapter(list,this);
        binding.recylcerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylcerview.setLayoutManager(layoutManager);

    }
}