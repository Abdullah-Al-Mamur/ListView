package com.shimul.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] countryNames = getResources().getStringArray(R.array.country_names);
        init();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.item_view, R.id.titleVU, countryNames);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+countryNames[i], Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        listView = findViewById(R.id.listVU);


    }
}
