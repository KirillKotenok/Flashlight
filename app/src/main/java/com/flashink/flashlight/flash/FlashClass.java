package com.flashink.flashlight.flash;

import android.hardware.Camera;

public class FlashClass implements Flah_functionality {


    @Override
    public void flashOn(Camera.Parameters cameraProperties) {
        cameraProperties.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
    }

    @Override
    public void flashOff(Camera.Parameters cameraProperties) {
        cameraProperties.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
    }
}