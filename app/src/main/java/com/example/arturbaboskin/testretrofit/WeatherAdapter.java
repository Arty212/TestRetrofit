package com.example.arturbaboskin.testretrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter
        extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private List<Weather> data;

    public WeatherAdapter(List<Weather> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(data.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text;
        private View view;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            text = view.findViewById(R.id.text);
        }
    }
}
