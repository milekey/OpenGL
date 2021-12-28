package com.scaredeer.opengl;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends AppCompatActivity implements GLSurfaceView.Renderer {
    private static final String TAG = MainActivity.class.getSimpleName();

    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");

        mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(this);

        setContentView(mGLSurfaceView);
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestroy");
        mGLSurfaceView.setRenderer(null);
        mGLSurfaceView = null;
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume");
        mGLSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "onPause");
        mGLSurfaceView.onPause();
        super.onPause();
    }

    // GLSurfaceView.Renderer (1/3)
    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        Log.v(TAG, "onSurfaceCreated");

        // ToDo
    }

    // GLSurfaceView.Renderer (2/3)
    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        Log.v(TAG, "onSurfaceChanged");

        // ToDo
    }

    // GLSurfaceView.Renderer (3/3)
    @Override
    public void onDrawFrame(GL10 gl10) {
        // ToDo
    }
}