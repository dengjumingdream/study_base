package com.zhenyue.techcenter.mockserver.config;

import org.apache.catalina.connector.Connector;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TomcatConfig {

    @Value("${server.addtionalPorts}")
    private String additionalPorts;

    @Bean
    public TomcatServletWebServerFactory getApplicationContext() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        Connector[] addtionalConnectors = this.additionalConnector();
        if (addtionalConnectors != null && addtionalConnectors.length > 0) {
            tomcat.addAdditionalTomcatConnectors(addtionalConnectors);
        }
        return tomcat;
    }

    private Connector[] additionalConnector() {
        if (StringUtils.isBlank(additionalPorts)) {
            return null;
        }
        String[] ports = this.additionalPorts.split(",");
        List<Connector> result = new ArrayList<>();
        for (String port : ports) {
            Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
            connector.setScheme("http");
            connector.setPort(Integer.valueOf(port));
            result.add(connector);
        }

        return result.toArray(new Connector[] {});
    }
}
