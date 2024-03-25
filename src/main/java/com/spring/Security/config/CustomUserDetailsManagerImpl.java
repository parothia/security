//package com.spring.Security.config;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class CustomUserDetailsManagerImpl implements UserDetailsManager {
//	private final CustomerRepo customerRepo;
//	public CustomUserDetailsManagerImpl(CustomerRepo customerRepo) {
//		this.customerRepo = customerRepo;
//	}
//
//	@Override
//	public void createUser(UserDetails user) {
//		System.out.println("createUser");
////		customerRepo.save()
//	}
//
//	@Override
//	public void updateUser(UserDetails user) {
//
//	}
//
//	@Override
//	public void deleteUser(String username) {
//
//	}
//
//	@Override
//	public void changePassword(String oldPassword, String newPassword) {
//
//	}
//
//	@Override
//	public boolean userExists(String username) {
//		return false;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Optional<Customer> customer = customerRepo.findByEmail(username);
//		if(customer.isPresent()) return new CustomUserDetailsImpl(customer.get());
//		else throw new UsernameNotFoundException("");
//	}
//}
