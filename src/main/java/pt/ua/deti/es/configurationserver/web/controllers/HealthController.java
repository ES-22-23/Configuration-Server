package pt.ua.deti.es.configurationserver.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.ua.deti.es.configurationserver.web.entities.HealthReport;
import pt.ua.deti.es.configurationserver.web.services.HealthService;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    @Autowired
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping()
    public HealthReport getHealthReport() {
        return healthService.getHealthReport();
    }

}
