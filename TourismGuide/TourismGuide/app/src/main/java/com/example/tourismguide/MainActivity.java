package com.example.tourismguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton mainButton = (ImageButton) findViewById(R.id.imageButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeekendActivity.class);
                startActivity(intent);
            }
        });
        ImageButton secondButton = (ImageButton) findViewById(R.id.imageButton2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });
        ImageButton thirdButton = (ImageButton) findViewById(R.id.imageButton3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VacationActivity.class);
                startActivity(intent);
            }
        });
        ImageButton fourthButton = (ImageButton) findViewById(R.id.imageButton4);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BeachActivity.class);
                startActivity(intent);
            }
        });
        ImageButton fifthButton = (ImageButton) findViewById(R.id.imageButton5);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HillsActivity.class);
                startActivity(intent);
            }
        });
        ImageButton sixthButton = (ImageButton) findViewById(R.id.imageButton6);
        sixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WaterfallActivity.class);
                startActivity(intent);
            }
        });
        ImageButton seventhButton = (ImageButton) findViewById(R.id.imageButton7);
        seventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IslandActivity.class);
                startActivity(intent);
            }
        });
        ImageButton eighthButton = (ImageButton) findViewById(R.id.imageButton8);
        eighthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ninthButton = (ImageButton) findViewById(R.id.imageButton9);
        ninthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReligiousActivity.class);
                startActivity(intent);
            }
        });
        ImageButton tenthButton = (ImageButton) findViewById(R.id.imageButton10);
        tenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BridgeActivity.class);
                startActivity(intent);
            }
        });
        ImageButton eleventhButton = (ImageButton) findViewById(R.id.imageButton11);
        eleventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParkActivity.class);
                startActivity(intent);
            }
        });
        ImageButton twelveButton = (ImageButton) findViewById(R.id.imageButton12);
        twelveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StatesActivity.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTajActivity();

            }
        });

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLotusActivity();

            }
        });

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDalActivity();

            }
        });

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManaliActivity();
            }
        });

        /*gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(),BeachActivity.class);
                intent.putExtra("name",placeNames[i]);
                intent.putExtra("image",placeImages[i]);
                startActivity(intent);
            }
        });*/


    }

    public void openTajActivity() {
        Intent intent = new Intent(this, TajActivity.class);
        startActivity(intent);
    }

    public void openLotusActivity() {
        Intent intent = new Intent(this, LotusActivity.class);
        startActivity(intent);


    }
    public void openDalActivity() {
        Intent intent = new Intent(this, DalActivity.class);
        startActivity(intent);


    }
    public void openManaliActivity() {
        Intent intent = new Intent(this, ManaliActivity.class);
        startActivity(intent);
    }


}
