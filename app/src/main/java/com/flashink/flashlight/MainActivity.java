package com.flashink.flashlight;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import com.flashink.flashlight.flash.FlashClass;

public class MainActivity extends AppCompatActivity {
    private Button start_stop;
    private FlashClass flashClass;
    private Camera camera;
    private Camera.Parameters cameraProperties;
    private SurfaceTexture previewTexture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_stop = findViewById(R.id.start_stop);
        camera = Camera.open();
        cameraProperties = camera.getParameters();
        flashClass = new FlashClass();

        start_stop.setOnClickListener(v -> {
            if (start_stop.getText().equals("Start")) {
                flashClass.flashOn(cameraProperties);
                start_stop.setText("Stop");

            } else if (start_stop.getText().equals("Stop")) {
                flashClass.flashOff(cameraProperties);
                start_stop.setText("Start");
            }
            camera.setParameters(cameraProperties);
            previewTexture = new SurfaceTexture(0);
            try {
                camera.setPreviewTexture(previewTexture);
            } catch (IOException e){
                e.printStackTrace();
            }
            camera.startPreview();

        });
    }
}