package com.calvinlsliang.betrayalstattracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class SpinnerAdapter<T> extends ArrayAdapter {

    public SpinnerAdapter(Context context, int resource, T[] objects) {
        super(context, resource, objects);
    }

    @NonNull @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        return view;
    }
}
