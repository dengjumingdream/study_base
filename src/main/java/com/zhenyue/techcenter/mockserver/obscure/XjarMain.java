package com.zhenyue.techcenter.mockserver.obscure;

import io.xjar.XCryptos;
import io.xjar.XKit;
import io.xjar.boot.XBoot;
import io.xjar.key.XKey;

public class XjarMain {
    public static void main(String[] args) {
        // Spring-Boot Jar包加密
//        String password = "123456";
//        XKey xKey = XKit.key(password);
//        XBoot.encrypt("/Library/WebServer/moonjoy/mockserver/target/mockserver-0.0.1-SNAPSHOT.jar", "/Users/admin/Desktop/webapp-xjar.jar", xKey);
        try {
            String key = "123456";
            XKey xKey = XKit.key(key);
//            XBoot.encrypt("/Library/WebServer/moonjoy/mockserver/target/mockserver-0.0.1-SNAPSHOT.jar", "/Users/admin/Desktop/gmtest1/webapp-xjar.jar", xKey);
//            XBoot.encrypt("/Users/admin/Desktop/gmtest1/mockserver-0.0.1-SNAPSHOT.jar", "/Users/admin/Desktop/gmtest1/webapp-xjar.jar", xKey);
//            XBoot.encrypt("/Users/admin/Desktop/gmtest1/rjoy-gamemaster-1.0.0.jar", "/Users/admin/Desktop/gmtest1/webapp-xjar.jar", xKey);
            XBoot.encrypt("/Users/admin/Desktop/gmtest1/rjoy-gamemaster.jar", "/Users/admin/Desktop/gmtest1/webapp-xjar.jar", xKey);

//            XCryptos.encryption()
//                    .from("/Users/admin/Desktop/gmtest1/rjoy-gamemaster-1.0.0.jar")
//                    .use("io.xjar")
//                    .exclude("/static/**/*")
//                    .exclude("/META-INF/resources/**/*")
//                    .to("/Users/admin/Desktop/gmtest1/webapp-xjar.jar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
