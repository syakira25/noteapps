package com.example.jameedean.mynotes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jameedean.mynotes.R;
import com.example.jameedean.mynotes.model.NoteModel;

import java.util.ArrayList;

/**
 * Created by JameeDean on 10/28/2017.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private Context mContext;
    private ArrayList<NoteModel>mData;

    public NotesAdapter(Context context){
        mContext=context;
        mData=new ArrayList<>();
    }

    @Override
    public NotesAdapter.NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_holder_notes, parent, false);
        return new NoteViewHolder(view);

    }

    @Override
    public void onBindViewHolder (NoteViewHolder holder, int position){
        NoteModel model = mData.get(position);

        holder.title.setText(model.getTitle());
        holder.description.setText((model.getTitle()));

    }

    @Override
    public int getItemCount(){return mData.size();}
    class NoteViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView description;

        public NoteViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title);
            description = itemView.findViewById(R.id.tv_description);
        }
    }
}
