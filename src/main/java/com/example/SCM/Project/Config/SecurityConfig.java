package com.example.SCM.Project.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(){
       UserDetails  user1=  User
            .withDefaultPasswordEncoder()
            .username("Keval")
            .password("1234")
            .roles("ADMIN", "USER")
            .build();
            var inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1);
            return inMemoryUserDetailsManager;
            }
}
