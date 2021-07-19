package com.example.tourismguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class HillsActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Araku Valley","Dal Housie","Tawang","Dharamshala","Coorg","Nilgiri Hills","Gulmarg","Shillong"};
    int[] placeImages = {R.drawable.hills1,R.drawable.hills2,R.drawable.hills3,R.drawable.hills4,R.drawable.hills5,R.drawable.hills6,R.drawable.hills7,R.drawable.hills8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hills);

        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(),GridActivity.class);
                intent.putExtra("name",placeNames[i]);
                intent.putExtra("image",placeImages[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return placeImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data2,null);

            TextView name = view1.findViewById(R.id.places);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(placeNames[i]);
            image.setImageResource(placeImages[i]);
            return view1;
        }
    }
}