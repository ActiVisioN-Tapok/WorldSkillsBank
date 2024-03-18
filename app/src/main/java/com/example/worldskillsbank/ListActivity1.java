package com.example.worldskillsbank;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity1 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listView = findViewById(R.id.listViews1);

        ArrayList<ListData1> lst = new ArrayList<>();
        lst.clear();

        lst.add(new ListData1(R.drawable.us, R.string.usd_name, R.string.usd, R.string.sell_cost, R.string.buy_cost));

        MyListAdapter lstAd = new MyListAdapter(this, lst);
        listView.setAdapter(lstAd);

    }


}