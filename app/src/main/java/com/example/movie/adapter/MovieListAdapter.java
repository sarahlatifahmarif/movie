package com.example.movie.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.model.MovieData;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>{
    private List<MovieData> movieData;
    private Context context;

    private OnMovieItemSelectedListener onMovieItemSelectedListener;

    public MovieListAdapter (Context context){
        this.context = context;
    }
    private void add(MovieData item){
        movieData.add(item);
        notifyItemInserted(movieData.size());
    }

    public void addAll(List<MovieData> movieDatas){
        for (MovieData movieData : movieDatas) {
            add(movieData);
        }
    }

    public void remove(MovieData item){
        int position = movieData.indexOf(item);
        if(position>-1){
            movieData.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear(){
        while (getItemCount()>0){
            remove(getItem(0));
        }
    }

    private MovieData getItem(int i) {
        return movieData.get(i);
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private interface OnMovieItemSelectedListener {
    }
}
