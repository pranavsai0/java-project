package com.project.login.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        // Allow public access to the signup page
                        .requestMatchers("/signup").permitAll()
                        // All other requests must be authenticated
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        // Use our custom login page (if you made one)
                        .loginPage("/login")
                        // Everyone can access the login page
                        .permitAll()
                );
        return http.build();
    }
}