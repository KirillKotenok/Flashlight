package kk.test.flashlight.flash;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

import java.net.ContentHandler;
import java.util.stream.Stream;

public class FlashClass implements Flah_functionality {
    private boolean flash_status = false;
    private Context context;
    private CameraManager cameraManager;
    private String cameraId;
    private Camera camera;

    @Override
    public void flashOn() {
        cameraManager.setTorchMode(getCameraId(), true);
        camera.
    }

    @Override
    public void flashOff() {

    }

    private String getCameraId() {

        cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        try {
            assert cameraManager!=null;
            cameraId =  cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        return cameraId;
    }


}
