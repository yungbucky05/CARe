package com.example.ron

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val maintenanceRecordsButton: Button = findViewById(R.id.maintenance_records)
        val scheduledMaintenanceButton: Button = findViewById(R.id.scheduled_maintenance)
        val fuelTrackingButton: Button = findViewById(R.id.fuel_tracking)

        maintenanceRecordsButton.setOnClickListener {
            val intent = Intent(this, maintenanceRecords::class.java)
            startActivity(intent)
        }

        scheduledMaintenanceButton.setOnClickListener {
            val intent = Intent(this, scheduledMaintenance::class.java)
            startActivity(intent)
        }

        fuelTrackingButton.setOnClickListener {
            val intent = Intent(this, fuelTracking::class.java)
            startActivity(intent)
        }
    }
}
