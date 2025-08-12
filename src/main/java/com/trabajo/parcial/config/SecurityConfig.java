package com.trabajo.parcial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

// Clase que configura la seguridad de la aplicación
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Configura la seguridad HTTP para la aplicación
        http
            // Permite el acceso libre a la consola H2 y requiere autenticación para el resto
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() // Permite acceso sin autenticación a la consola H2
                .anyRequest().authenticated() // Requiere autenticación para cualquier otro endpoint
            )
            // Desactiva la protección CSRF (necesario para H2 y APIs REST)
            .csrf(csrf -> csrf.disable())
            // Desactiva los headers de seguridad para permitir el uso de frames (necesario para H2)
            .headers(headers -> headers.disable())
            // Habilita autenticación HTTP Basic
            .httpBasic(httpBasic -> {});
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Codificador seguro para contraseñas
        return new BCryptPasswordEncoder();
    }

    // Configura un usuario en memoria para autenticación básica
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.builder()
            .username("EIA") // Usuario para acceder a la API
            .password(passwordEncoder.encode("EIA")) // Contraseña codificada
            .roles("USER") // Rol asignado
            .build(); // Construye el usuario con los detalles especificados
        return new InMemoryUserDetailsManager(user);
    }
}