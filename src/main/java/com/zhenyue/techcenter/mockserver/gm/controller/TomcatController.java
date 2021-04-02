package com.zhenyue.techcenter.mockserver.gm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Valve;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.AbstractHttp11JsseProtocol;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

@RestController
@RequestMapping("local/tomcat")
public class TomcatController {


    @Autowired
    private TomcatServletWebServerFactory tomcatServletWebServerFactory;

    @Value("${server.saveLogName}")
    private String saveLogName;

    /**
     *   查询
     * @return
     */
    @RequestMapping(value = "/pause", method = RequestMethod.GET)
    public JSONObject pause() {
        List<Connector> connectorList = tomcatServletWebServerFactory.getAdditionalTomcatConnectors();
        for (Connector connector : connectorList) {
            int port = connector.getPort();
            if (port == 8082) {
                connector.pause();
            }
        }
        return null;
    }

    /**
     *   查询
     * @return
     */
    @RequestMapping(value = "/resume", method = RequestMethod.GET)
    public JSONObject resume() {
        List<Connector> connectorList = tomcatServletWebServerFactory.getAdditionalTomcatConnectors();
        for (Connector connector : connectorList) {
            int port = connector.getPort();
            if (port == 8082) {
                connector.resume();
            }
        }
        return null;
    }

    /**
     *   查询
     * @return
     */
    @RequestMapping(value = "/stop", method = RequestMethod.GET)
    public JSONObject stop() {
        List<Connector> connectorList = tomcatServletWebServerFactory.getAdditionalTomcatConnectors();
        for (Connector connector : connectorList) {
            int port = connector.getPort();
            if (port == 8082) {
                try {
                    connector.stop();
                } catch (LifecycleException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     *   查询
     * @return
     */
    @RequestMapping(value = "/shutDown", method = RequestMethod.GET)
    public JSONObject shutDown() {
        List<Connector> connectorList = tomcatServletWebServerFactory.getAdditionalTomcatConnectors();
        AbstractHttp11Protocol protocolHandler = (Http11NioProtocol) connectorList.get(0).getProtocolHandler();
        return null;
    }
}
