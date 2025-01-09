package com.example.flightease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SearchFlightsActivity extends AppCompatActivity {
    private EditText etSource, etDestination, etDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_flights);

        etSource = findViewById(R.id.etFrom);
        etDestination = findViewById(R.id.etTo);
        etDate = findViewById(R.id.etDate);

        Button btnFindFlights = findViewById(R.id.btnFindFlights);
        btnFindFlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchFlightsActivity.this, FlightListActivity.class);
                intent.putExtra("source", etSource.getText().toString());
                intent.putExtra("destination", etDestination.getText().toString());
                intent.putExtra("date", etDate.getText().toString());
                startActivity(intent);
            }
        });
    }
}

