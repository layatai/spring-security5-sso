package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Madhura Bhave
 */
@Configuration
public class AuthenticationConfiguration {

//	@Bean
//	UserDetailsService userDetailsService() {
//		UserDetails greg = User
//				.withUsername("dev")
//				.password("{noop}dev")
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(greg);
//	}
}