//package com.shoppingapp.discoveryserver.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurer<AuthenticationManagerBuilder> {
//
//    @Override
//    public void init(AuthenticationManagerBuilder builder) throws Exception {
//
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder builder) throws Exception {
//        builder.inMemoryAuthentication()
//                .withUser("eureka").password("password")
//                .authorities("USER");
//    }
//
//
////    public void configure(HttpSecurity builder) throws Exception {
////        builder.inMemoryAuthentication()
////                .withUser("eureka").password("password")
////                .authorities("USER");
////    }
//}
