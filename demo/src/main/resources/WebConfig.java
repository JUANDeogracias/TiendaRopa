package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permitir CORS para todas las rutas
                registry.addMapping("/**")
                        // Permitir origen desde localhost:3000
                        .allowedOrigins("http://localhost:3000", "http://localhost:4000")
                        // Permitir métodos HTTP específicos
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        // Permitir todos los encabezados
                        .allowedHeaders("*")
                        // Permitir el uso de credenciales
                        .allowCredentials(true);
            }
        };
    }
}
