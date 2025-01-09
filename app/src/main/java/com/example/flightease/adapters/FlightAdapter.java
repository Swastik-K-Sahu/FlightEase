package com.example.flightease.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.example.flightease.models.Flight;
import com.example.flightease.R;

import java.util.ArrayList;

public class FlightAdapter extends ArrayAdapter<Flight> {
    public FlightAdapter(Context context, ArrayList<Flight> flights) {
        super(context, 0, flights);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_flight, parent, false);
        }

        Flight flight = getItem(position);
        TextView tvAirline = convertView.findViewById(R.id.tvFlightName);
        TextView tvTime = convertView.findViewById(R.id.tvDepartureTime);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);

        tvAirline.setText(flight.getAirline());
        tvTime.setText(flight.getTime());
        tvPrice.setText("₹" + flight.getPrice());

        return convertView;
    }
}

