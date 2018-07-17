package com.mrjeus.mygirl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private ArrayList<Hero> mList;
    Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<Hero> object){
        this.mList = object;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.image,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Hero mHero = mList.get(position);
        holder.mImage.setBackgroundResource(mHero.getmImage());
        holder.mName.setText(mHero.getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public  class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView mImage;
        TextView mName;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mImage = (ImageView) itemView.findViewById(R.id.image_hero);
            mName = (TextView) itemView.findViewById(R.id.text_name);
        }
    }
}
