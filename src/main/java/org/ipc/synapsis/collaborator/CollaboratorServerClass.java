package org.ipc.synapsis.collaborator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = {"org.ipc.synapsis.collaborator.repository"})
public class CollaboratorServerClass {

    public static void main(final String[] args) {
        SpringApplication.run(CollaboratorServerClass.class, args);
    }

}
