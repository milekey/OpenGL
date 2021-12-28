package com.scaredeer.opengl;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");

        mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(new Renderer());

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
}