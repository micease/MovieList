package com.example.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter  extends BaseAdapter {

    private LayoutInflater myInflater;
    private ArrayList<MovieTag> movieTags;
    public MovieAdapter(Context c, ArrayList<MovieTag> movie){
        myInflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        this.movieTags = movie;
    }
    @Override
    public int getCount() {
        return movieTags.size();
    }

    @Override
    public Object getItem(int position) {
        return movieTags.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movieTags.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MovieTag movie = (MovieTag) getItem(position);

        convertView = myInflater.inflate(R.layout.item_view, null);
        ImageView pic2 = (ImageView) convertView.findViewById(R.id.pic);
        pic2.setImageResource(movie.pic);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        name.setText(movie.name);
        TextView date = (TextView) convertView.findViewById(R.id.date);
        date.setText(movie.date);
        TextView intro = (TextView) convertView.findViewById(R.id.summary);
        intro.setText(movie.summary);
        return convertView;
    }
}
