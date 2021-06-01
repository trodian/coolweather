package com.example.coolweather.util;

import android.view.textclassifier.TextLinks;

public class HttpUtil {
    public  static void sendOkHttpRequest(String address,okhttp3.Callbck callback){
    OkHttpClient client=new OkHttpClient();
    Request request=new Request.Builder().url(address).build();
    client.newCall(request).enqueue(callback);
    }
}
