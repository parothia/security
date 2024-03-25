package com.spring.Security.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	private final CustomerRepo customerRepo;
	public CustomUserDetailsService(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Customer> customer = customerRepo.findByEmail(username);
		if(customer.isPresent()) {
			return customer.get();
		}
		else throw new UsernameNotFoundException("");
	}
}
