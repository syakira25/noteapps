package com.example.jameedean.e_ideas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JameeDean on 11/12/2017.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private Context mContext;
    private ArrayList<NoteModel> mData;

    public NotesAdapter(Context context) {
        mContext = context;
        mData = new ArrayList<>();
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_holder_notes, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {

        NoteModel model = mData.get(position);

        holder.title.setText(model.getTitle());
        holder.description.setText(model.getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addData(NoteModel model) {
        mData.add(model);

        notifyDataSetChanged();
    }

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
