package com.myapp.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlayerAdapter extends ArrayAdapter<Player> {
                     private Context mContext;
                     public int mResource;
                                                                        // i want to use ArrayList

    public PlayerAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Player> objects) {
        super(context, resource, objects);
        this.mContext= context;
        this.mResource= resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent,false);
        ImageView imageView =convertView.findViewById(R.id.image);

        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtSDes = convertView.findViewById(R.id.txtSDes);
        imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());
        txtSDes.setText(getItem(position).getDes());
        return convertView;

    }
}
