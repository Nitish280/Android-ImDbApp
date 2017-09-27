package com.android.app.imdbapp;

import android.app.Application;

import com.android.app.imdbapp.connection.ConnectivityReceiver;

public class ImdbApplication extends Application {

    private static ImdbApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static synchronized ImdbApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
