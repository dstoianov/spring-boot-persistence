package se.techinsight.persistence.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Profile("local")
public class SwaggerConfig {

    @Value("${spring.application.description: test description}")
    private String description;

    @Value("${spring.application.version:v1.0.0}")
    private String version;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .version("VERSION: " + version)
                        .title("Courier API Integration")
                        .description(description)
                        .license(getLicense())
                );
    }

    private License getLicense() {
        return new License()
                .name("Courier API")
                .url("https://techinsight.se");
    }
}
