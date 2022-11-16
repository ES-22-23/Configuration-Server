package pt.ua.deti.es.configurationserver.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.ua.deti.es.configurationserver.web.entities.HealthReport;

@Service
public class HealthService {

    private final ServicesConfigurationService servicesConfigurationService;

    @Autowired
    public HealthService(ServicesConfigurationService servicesConfigurationService) {
        this.servicesConfigurationService = servicesConfigurationService;
    }

    public HealthReport getHealthReport() {
        return new HealthReport(true, servicesConfigurationService.getServicesConfigurationsReport());
    }

}
