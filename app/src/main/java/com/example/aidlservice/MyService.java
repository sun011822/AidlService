package com.example.aidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

import com.example.aidlservice.IaidlSun;


public class MyService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    IaidlSun.Stub stub = new IaidlSun.Stub() {
        @Override
        public int addTest(int a, int b) throws RemoteException {
            return a+b;
        }

        @Override
        public String appendTest(String a, String b) throws RemoteException {
            return a+b;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }
}
