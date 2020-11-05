package com.flashink.flashlight.flash;

import android.hardware.Camera;

public interface Flah_functionality {
    void flashOn(Camera.Parameters cameraProperties);
    void flashOff(Camera.Parameters cameraProperties);
}
