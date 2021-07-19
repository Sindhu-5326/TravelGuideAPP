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

public class MonumentsActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"India Gate", "Red Fort", "Cellular Jail", "Mysore Palace", "Jama Masjid","Varanasi", "Ajanta Caves", "Mahabalipuram"};
    int[] placeImages = {R.drawable.monument1, R.drawable.monument2, R.drawable.monument3, R.drawable.monument4, R.drawable.monument5, R.drawable.monument6, R.drawable.monument7, R.drawable.monument8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);
        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(), GridActivity.class);
                intent.putExtra("name", placeNames[i]);
                intent.putExtra("image", placeImages[i]);
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
            View view1 = getLayoutInflater().inflate(R.layout.row_data5, null);

            TextView name = view1.findViewById(R.id.places);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(placeNames[i]);
            image.setImageResource(placeImages[i]);
            return view1;
        }

    }
}