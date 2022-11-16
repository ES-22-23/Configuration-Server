package pt.ua.deti.es.configurationserver.web.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceConfigurationReport {

    private String serviceName;
    private boolean exists;
    private boolean isAccessible;

}
