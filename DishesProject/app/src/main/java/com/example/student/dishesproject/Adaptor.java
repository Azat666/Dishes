package com.example.student.dishesproject;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adaptor extends ArrayAdapter<Model> {
    Context context;
    int resource;
    List<Model> list;

    public Adaptor(@NonNull Context context, @LayoutRes int resource, @NonNull List<Model> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        list = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitem = convertView;
        if (listitem == null) {
            listitem = LayoutInflater.from(context).inflate(resource, parent, false);
        }
        Model model = list.get(position);
        ImageView imageView = (ImageView) listitem.findViewById(R.id.item_image);
        TextView textView = (TextView) listitem.findViewById(R.id.text);
        TextView textView1 = (TextView) listitem.findViewById(R.id.text_story);
        TextView textView2 = (TextView) listitem.findViewById(R.id.text_colore);
        Picasso.with(context).load(model.getImageUrl()).into(imageView);
        textView.setText(model.getName());
        textView1.setText(model.getStory());
        textView2.setText(model.getCalory());
        return listitem;
    }
}
