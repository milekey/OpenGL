package com.scaredeer.opengl;

import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * ゲームのメインループに相当するクラス
 * （もちろん、画面の更新を中心としたもので、ゲームモデルの論理的なループとは必ずしも同じではないが、
 * 実用上はこのクラスを中心に構成していいと思う）
 *
 * MainActivity で implement して記述を統合することも全然可能だが、
 * MainActivity はその他の UI のコードなども盛り込まれることになるので、コードの見通しが悪くなり、
 * あまり実用的ではないので、素直に分離している。
 */
public class Renderer implements GLSurfaceView.Renderer {
    private static final String TAG = Renderer.class.getSimpleName();

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        Log.v(TAG, "onSurfaceCreated");

        // ToDo
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        Log.v(TAG, "onSurfaceChanged");

        // ToDo
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        // ToDo
    }
}
