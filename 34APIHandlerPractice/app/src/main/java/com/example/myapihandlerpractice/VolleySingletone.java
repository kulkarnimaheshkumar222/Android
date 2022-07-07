package com.example.myapihandlerpractice;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingletone {
    private static VolleySingletone mInstance;
    private RequestQueue mRequestQueue;

    public VolleySingletone(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingletone getInstance(Context context) {
        if (mInstance ==null) {
            mInstance = new VolleySingletone(context);
        }
        return  mInstance;
    }

    public RequestQueue getRequestQueue() {
     return  mRequestQueue;
    }

}
