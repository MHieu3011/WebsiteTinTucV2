package com.ptit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ptit.service.impl.CustomerUserDetailService;

@Configuration
@EnableWebSecurity
public class WebSercurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	private CustomerUserDetailService userDetailService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin/**", "/web/**", "/login/**").permitAll()	//load resources/static/**
			.anyRequest().authenticated().and()
			.formLogin().loginPage("/dang-nhap").permitAll()
			.loginProcessingUrl("/j_spring_security_check")
			.defaultSuccessUrl("/trang-chu")
			.failureUrl("/dang-nhap?success=fail");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
//			.and()
//			.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("123456")).authorities("USER");
//		System.out.println(passwordEncoder().encode("123456"));
	}
}
