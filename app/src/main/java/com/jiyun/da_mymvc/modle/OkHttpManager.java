package com.jiyun.da_mymvc.modle;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 张凯雅 on 2017/8/10.
 */

public class OkHttpManager implements Okhttp {
    public OkHttpClient client;
    private static OkHttpManager manager;

    public OkHttpManager() {
        client=new OkHttpClient();
    }
    public static OkHttpManager getInstance(){
        if (manager==null){
            manager=new OkHttpManager();
        }
        return manager;
    }

    @Override
    public void doget(String url, final CallBack callBack) {
        client=new OkHttpClient();
        Request request=new Request.Builder().url(url).build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.failed(call.toString());

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson=new Gson();
                Bean bean = gson.fromJson(string, Bean.class);
                callBack.success(bean);
            }
        });

    }

    @Override
    public void dopost(String url, CallBack callBack) {

    }
}
