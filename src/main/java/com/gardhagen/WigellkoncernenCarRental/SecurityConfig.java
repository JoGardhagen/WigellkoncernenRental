package com.gardhagen.WigellkoncernenCarRental;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        auth.inMemoryAuthentication()
                .withUser("user")
                .password("1234")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
                .and()
                .withUser("superAdmin")
                .password("1")
                .roles("ADMIN","USER");


    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){ return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/api/v1/cars").hasRole("USER")
                .antMatchers("/api/v1/ordercar").hasRole("USER")
                .antMatchers("/api/v1/exchange").hasRole("USER")
                .antMatchers("/api/v1/myorders").hasRole("USER")
                .antMatchers("/api/v1/updateorder").hasRole("USER")
                .antMatchers("/api/v1/customers").hasRole("ADMIN")
                .antMatchers("/api/v1/addcar").hasRole("ADMIN")
                .antMatchers("/api/v1/deletecar/**").hasRole("ADMIN")
                .antMatchers("/api/v1/updatecar/**").hasRole("ADMIN")
                .antMatchers("/api/v1/cancelorder/**").hasRole("ADMIN")
                .and()
                .httpBasic();

        http.cors().and().csrf().disable();

    }
}
