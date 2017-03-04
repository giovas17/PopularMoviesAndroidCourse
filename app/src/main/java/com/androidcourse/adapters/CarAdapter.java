package com.androidcourse.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidcourse.models.Carro;
import com.androidcourse.popularmoviesandroidcourse.R;

import java.util.ArrayList;

/**
 * Created by darkgeat on 04/03/2017.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private ArrayList<Carro> data;
    private Context context;

    public CarAdapter(Context context,ArrayList<Carro> carros){
        this.context = context;
        this.data = carros;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_list,null,false);
        ViewHolder holder = new ViewHolder(view);
        view.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Carro carro = data.get(position);

        holder.title.setText(carro.getTitle());
        holder.description.setText(carro.getDescription());
        holder.image.setImageResource(carro.getId_image());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView title;
        private final TextView description;
        private final ImageView image;

        public ViewHolder(View view){
            super(view);
            title = (TextView)view.findViewById(R.id.titleTextView);
            description = (TextView)view.findViewById(R.id.subtitleTextView);
            image = (ImageView)view.findViewById(R.id.imageCarro);
        }
    }
}
