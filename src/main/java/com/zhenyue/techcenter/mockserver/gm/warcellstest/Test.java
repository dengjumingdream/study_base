package com.zhenyue.techcenter.mockserver.gm.warcellstest;

import cn.hutool.http.HttpUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String app_id = "cli_9f7d64567834900e";
        String ip = "http://192.168.102.27:8087/test/list";
        String redirect_uri = URLEncoder.encode( ip, "UTF-8" );
        String url_temp = "https://open.feishu.cn/open-apis/authen/v1/index?redirect_uri=" + redirect_uri
                + "&app_id=" + app_id;
        String info = HttpUtil.get(url_temp);
    }
}
