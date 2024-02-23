package com.example.appdetipsdecodificacin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TipAdapter extends RecyclerView.Adapter<TipAdapter.ViewHolder> {
    private Context context;
    private List<Tip> tipList;

    public TipAdapter(Context context, List<Tip> tipList) {
        this.context = context;
        this.tipList = tipList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.list_item_tip, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tip tip = tipList.get(position);
        holder.textViewContent.setText(tip.getContent());
        holder.textViewAuthor.setText(tip.getAuthor());
        holder.textViewLikes.setText(String.valueOf(tip.getLikes()));
    }

    @Override
    public int getItemCount() {
        return tipList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewContent, textViewAuthor, textViewLikes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewContent = itemView.findViewById(R.id.textViewContent);
            textViewAuthor = itemView.findViewById(R.id.textViewAuthor);
            textViewLikes = itemView.findViewById(R.id.textViewLikes);
        }
    }
}

