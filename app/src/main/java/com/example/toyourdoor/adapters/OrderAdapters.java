package com.example.toyourdoor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.toyourdoor.R;
import com.example.toyourdoor.models.OrdersModel;

import java.util.ArrayList;

public class OrderAdapters extends RecyclerView.Adapter<OrderAdapters.viewHolder> {

    ArrayList<OrdersModel> list;
    Context context;

    public OrderAdapters(ArrayList<OrdersModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final OrdersModel model = list.get(position);
        holder.orderImage.setImageResource(model.getOrderImaage());
        holder.orderName.setText(model.getSoldItemName());
        holder.orderNo.setText(model.getOrderNo());
        holder.Price.setText(model.getPrice());


    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView orderImage;
        TextView orderName,orderNo,Price;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            orderImage = itemView.findViewById(R.id.orderimage);
            orderName = itemView.findViewById(R.id.orderitemname);
            orderNo = itemView.findViewById(R.id.orderNumber);
            Price = itemView.findViewById(R.id.price);
        }
    }
}
