package pt.ua.deti.es.configurationserver.web.entities;

import lombok.Data;

import java.util.List;

@Data
public class HealthReport {

    private final boolean isRunning;
    private final List<?> additionalProperties;

}
