package pt.ua.deti.es.configurationserver.web.entities;

import lombok.Getter;

@Getter
public enum ServiceConfiguration {

    SERVICE_REGISTRY("Service Registry", "/Configurations/service_registry/production/service_registry-production.yml");

    private final String serviceName;
    private final String configurationPath;

    ServiceConfiguration(String serviceName, String configurationPath) {
        this.serviceName = serviceName;
        this.configurationPath = configurationPath;
    }

}
