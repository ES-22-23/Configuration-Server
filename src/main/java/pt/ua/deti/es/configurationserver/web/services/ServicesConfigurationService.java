package pt.ua.deti.es.configurationserver.web.services;

import org.springframework.stereotype.Service;
import pt.ua.deti.es.configurationserver.web.entities.ServiceConfiguration;
import pt.ua.deti.es.configurationserver.web.entities.ServiceConfigurationReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesConfigurationService {

    public List<ServiceConfigurationReport> getServicesConfigurationsReport() {

        List<ServiceConfigurationReport> serviceConfigurationReports = new ArrayList<>();

        for (ServiceConfiguration serviceConfiguration : ServiceConfiguration.values()) {

            File serviceConfigurationFile = new File(serviceConfiguration.getConfigurationPath());

            ServiceConfigurationReport serviceConfigurationReport = ServiceConfigurationReport.builder()
                    .serviceName(serviceConfiguration.getServiceName())
                    .exists(serviceConfigurationFile.exists())
                    .isAccessible(serviceConfigurationFile.isFile() && serviceConfigurationFile.canRead())
                    .build();

            serviceConfigurationReports.add(serviceConfigurationReport);

        }

        return serviceConfigurationReports;

    }

}
