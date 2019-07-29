package com.example.mrecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyownAdapter extends RecyclerView.Adapter <MyownAdapter.MyownHolder>{
    String[] d1;
    String[] d2;
    int[] img;
Context ctr;


    public MyownAdapter(Context ctx, String[] s1, String[] s2, int[] i1) {
   ctr=ctx;
   d1=s1;
   d2=s2;
    img=i1;
    }

    @NonNull
    @Override
    public MyownAdapter.MyownHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lf = LayoutInflater.from(ctr);
        View myview=lf.inflate(R.layout.my_row,parent,false);
        return new MyownHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyownAdapter.MyownHolder holder, int position) {
holder.t1.setText(d1[position]);
        holder.t2.setText(d2[position]);
        holder.im.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return d1.length;
    }

    public class MyownHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView im;
        public MyownHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.textView);
            t2=itemView.findViewById(R.id.textView2);
            im=itemView.findViewById(R.id.myimage);

        }
    }
}
