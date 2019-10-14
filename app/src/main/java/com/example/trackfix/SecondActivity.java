package com.example.trackfix;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private ListView myListView;
    private ListAdapter adapter;
    final List<ListItem> items = MainActivity.items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myListView = (ListView) findViewById(R.id.myListView);
        //Button sortButton = (Button) findViewById(R.id.sortButton);


        adapter = new ListAdapter(this, items);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                //  Data transfer: image , name, description
                intent.putExtra("EXTRA_NAME", items.get(i).getTitle());
                intent.putExtra("EXTRA_DESCRIPTION", items.get(i).getDescription());
                intent.putExtra("EXTRA_IMAGE_ID", items.get(i).getImageId());

                startActivity(intent);
            }
        });

        //Add button to add a default
        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               items.add(new ListItem("Default Title", R.drawable.ic_launcher_foreground, "Default description", "-.--€"));
                adapter.notifyDataSetChanged();
            }
        });


        Button deleteButton = (Button) findViewById(R.id.deleteButton);

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(items.isEmpty())) {
                    items.remove(0);
                }
                adapter.notifyDataSetChanged();
            }
        });

        Button sortButton = (Button) findViewById(R.id.sortButton);

        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(items, new Comparator<ListItem>() {
                    @Override
                    public int compare(ListItem i1, ListItem i2) {
                        return i1.getTitle().compareTo(i2.getTitle());
                    }
                });
                adapter.notifyDataSetChanged();
            }
        });

    }


}
