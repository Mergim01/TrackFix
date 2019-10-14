package com.example.trackfix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ListAdapter extends ArrayAdapter<ListItem>{

    public ListAdapter(Context context, List<ListItem> objects) {
        super(context, R.layout.my_listview_detail, objects);
    }
    

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.my_listview_detail, null);
        }

        TextView title = (TextView) v.findViewById(R.id.nameTextView);
        //TextView description = (TextView) v.findViewById(R.id.descriptionTextView);
        ImageView image = (ImageView) v.findViewById(R.id.shortFoodImageView);
        TextView price = (TextView) v.findViewById(R.id.priceTextView);

        ListItem item = getItem(position);

        title.setText(item.getTitle());
        //description.setText(item.getDescription());
        image.setImageResource(item.getImageId());
        price.setText(item.getPrice());

        return v;
    }
}
