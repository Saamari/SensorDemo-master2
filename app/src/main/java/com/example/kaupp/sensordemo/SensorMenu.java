package com.example.kaupp.sensordemo;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import static android.R.attr.button;
import static com.example.kaupp.sensordemo.R.id.accelerometer;

public class SensorMenu extends AppCompatActivity {

    private SensorManager mySensorManager;
    private Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_menu);

        mySensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if (mySensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null) {
            Button button = (Button) findViewById(R.id.gravity);
            button.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
            Button button = (Button) findViewById(accelerometer);
            button.setVisibility(View.VISIBLE);

        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) != null) {
            Button button = (Button) findViewById(R.id.ambtemp);
            button.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {
            Button accB = (Button) findViewById(R.id.gyro);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {
            Button accB = (Button) findViewById(R.id.light);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null) {
            Button accB = (Button) findViewById(R.id.linacc);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {
            Button accB = (Button) findViewById(R.id.magnetic);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) != null) {
            Button accB = (Button) findViewById(R.id.pressure);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) != null) {
            Button accB = (Button) findViewById(R.id.relhum);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) != null) {
            Button accB = (Button) findViewById(R.id.rotvec);
            accB.setVisibility(View.VISIBLE);
        }
        if (mySensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {
            Button accB = (Button) findViewById(R.id.proximity);
            accB.setVisibility(View.VISIBLE);
        }
    }

    public void acceleration (View view){
        Intent startAcceleration = new Intent(this, accelerationActivity.class);
        startActivity(startAcceleration);
    }

    }


