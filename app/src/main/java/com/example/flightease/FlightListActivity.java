package com.example.flightease;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flightease.adapters.FlightAdapter;
import com.example.flightease.models.Flight;

import java.util.ArrayList;

public class FlightListActivity extends AppCompatActivity {
    private ListView lvFlights;
    private ArrayList<Flight> flightList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_list);

        lvFlights = findViewById(R.id.lvFlights);
        flightList = new ArrayList<>();

        // Mock data
        flightList.add(new Flight("Airline 1", "Mumbai", "Delhi", "10:00 AM", "5000"));
        flightList.add(new Flight("Airline 2", "Mumbai", "Delhi", "2:00 PM", "5500"));

        FlightAdapter adapter = new FlightAdapter(this, flightList);
        lvFlights.setAdapter(adapter);

        lvFlights.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FlightListActivity.this, BookingDetailsActivity.class);
                intent.putExtra("flight", flightList.get(position));
                startActivity(intent);
            }
        });
    }
}

