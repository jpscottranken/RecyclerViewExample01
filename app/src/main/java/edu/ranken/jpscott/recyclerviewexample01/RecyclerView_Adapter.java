package edu.ranken.jpscott.recyclerviewexample01;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

public class RecyclerView_Adapter extends RecyclerView.Adapter<View_Holder>{
    List<Data> list = Collections.emptyList();
    Context context;

    public RecyclerView_Adapter(List<Data> data, Application application) {
        this.list = data;
        this.context = application;
    }

    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Inflate the layout.  Initialize the View Holder
        View v = LayoutInflater.from(
                parent.getContext()).inflate(R.layout.row_layout, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {
        //  Use the provide View Holder on the onCreateViewHolder method
        holder.tvDescription.setText(list.get(position).name);
        holder.ivProgram.setImageResource(list.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
