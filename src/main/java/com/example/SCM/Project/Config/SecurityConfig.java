package com.example.SCM.Project.Config;

import java.net.PasswordAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.SCM.Project.Services.SecurityCustomUserDetailsService;

@Configuration
public class SecurityConfig {

    @Autowired
    private SecurityCustomUserDetailsService securityCustomUserDetailsService;
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider= new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(securityCustomUserDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.authorizeHttpRequests(authorize->{
            authorize.requestMatchers("/user/**").authenticated();
            authorize.anyRequest().permitAll();
        });
        httpSecurity.formLogin(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
