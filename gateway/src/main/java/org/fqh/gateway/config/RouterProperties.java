package org.fqh.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author jiong1184
 * @date 2021/6/30 23:21
 */
@Component
@ConfigurationProperties(prefix = "gateway.route")
public class RouterProperties {

    private Map<String, String> componentUrlMap;
}
