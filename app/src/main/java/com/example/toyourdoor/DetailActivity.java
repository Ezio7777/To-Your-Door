 package com.example.toyourdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.toyourdoor.databinding.ActivityDetailBinding;

 public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Food details.
        final int image = getIntent().getIntExtra("image",0);
        final int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");

        binding.detailimage.setImageResource(image);
        binding.pricelable.setText(String.format("%d",price));
        binding.detailfoodname.setText(name);
        binding.detailDescription.setText(description);
 
        //Adding DataBase.
        DBHelper helper = new DBHelper(this);

        binding.insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = helper.insertOrder(
                        binding.nameBox.getText().toString(),
                        binding.phoneBox.getText().toString(),
                        price,
                        image,
                        name,
                        description,
                        Integer.parseInt(binding.qantity.getText().toString())
                );
             
                if(isInserted){
                    Toast.makeText(DetailActivity.this, "Data Success", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(DetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
