package org.isegodin.configserver.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author igor.segodin
 */
@EnableConfigServer
@SpringBootApplication(
        exclude = {
//                DataSourceAutoConfiguration.class
        }
)
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}