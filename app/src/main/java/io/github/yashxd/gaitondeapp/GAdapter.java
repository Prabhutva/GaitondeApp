package io.github.yashxd.gaitondeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

// Adapter : help us to make each and every list item of the list. Connect to the xml file for list item of recycler view.
public class GAdapter extends RecyclerView.Adapter<GViewHolder>
{//subclass of gviewholder.
    List<GModel> hitList;

    public GAdapter(List<GModel> hitList) {
        this.hitList = hitList;
    }

    @NonNull
    @Override
    public GViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // view_g => name of the layout file
        View view = inflater.inflate(R.layout.view_g, parent, false);
        GViewHolder holder = new GViewHolder(view);
        return holder;
    }//link xml to recycler view

    @Override//means whatever we are extending is changed to put our own stuff
    public void onBindViewHolder(@NonNull GViewHolder holder, int position) {
        GModel badGuy = hitList.get(position);
        holder.populate(badGuy);
    }

    @Override
    public int getItemCount() {
        return hitList.size();
    }
}
