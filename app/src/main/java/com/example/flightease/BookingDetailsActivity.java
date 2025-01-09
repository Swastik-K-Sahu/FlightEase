package com.example.flightease;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flightease.models.Booking;

public class BookingDetailsActivity extends AppCompatActivity {

    private TextView tvFlightInfo, tvPassengerName, tvDepartureTime, tvArrivalTime, tvPrice;
    private Button btnConfirmBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_details);

        tvFlightInfo = findViewById(R.id.tvFlightInfo);
        tvPassengerName = findViewById(R.id.tvPassengerName);
        tvDepartureTime = findViewById(R.id.tvDepartureTime);
        tvArrivalTime = findViewById(R.id.tvArrivalTime);
        tvPrice = findViewById(R.id.tvPrice);
        btnConfirmBooking = findViewById(R.id.btnConfirmBooking);

        Booking booking = getSampleBooking();

        // Display booking details
        tvFlightInfo.setText("Flight: " + booking.getFlightName());
        tvPassengerName.setText("Passenger: " + booking.getPassengerName());
        tvDepartureTime.setText("Departure: " + booking.getDepartureTime());
        tvArrivalTime.setText("Arrival: " + booking.getArrivalTime());
        tvPrice.setText("Price: $" + booking.getPrice());

        // Confirm booking action
        btnConfirmBooking.setOnClickListener(view -> {
            Toast.makeText(this, "Booking Confirmed!", Toast.LENGTH_SHORT).show();
        });
    }


    private Booking getSampleBooking() {
        return new Booking(
                "BKG12345",
                "John Doe",
                "Sky Airlines - Flight 789",
                "10:00 AM",
                "1:00 PM",
                150.00
        );
    }
}

