package com.example.jeuballe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

public class modeNormal extends AppCompatActivity {
    private float imagex,imagey;
    private int capteur = Sensor.TYPE_ACCELEROMETER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_normal);

        final SensorManager sm = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        sm.registerListener(accelerometreListener,sm.getDefaultSensor(capteur), SensorManager.SENSOR_DELAY_UI);

    }

    private final SensorEventListener accelerometreListener = new SensorEventListener() {

        public void onSensorChanged(SensorEvent s) {
            float x = s.values[0];
            float y = s.values[1];

            imagex = imagex - 5 * x;
            imagey = imagey + 5 * y;
        }


        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
        };
}
