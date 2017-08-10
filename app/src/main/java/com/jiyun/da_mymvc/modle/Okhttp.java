package com.jiyun.da_mymvc.modle;

/**
 * Created by 张凯雅 on 2017/8/10.
 */

public interface Okhttp {
    void doget(String url,CallBack callBack);
    void dopost(String url,CallBack callBack);
}
