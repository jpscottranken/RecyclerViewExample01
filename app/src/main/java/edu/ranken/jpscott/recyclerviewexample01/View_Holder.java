package edu.ranken.jpscott.recyclerviewexample01;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder {
    TextView tvDescription;
    ImageView ivProgram;

    public View_Holder(View itemView) {
        super(itemView);
        tvDescription = itemView.findViewById(R.id.tvDescription);
        ivProgram     = itemView.findViewById(R.id.ivProgram);
    }
}
