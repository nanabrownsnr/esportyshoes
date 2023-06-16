package com.eSportyShoes.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.eSportyShoes.entity.User;
import com.eSportyShoes.entity.Role;
import com.eSportyShoes.repository.UserRepo;
import com.eSportyShoes.web.dto.UserRegistrationDto;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepo userrepo;
	
	public UserServiceImpl(UserRepo userrepo) {
		super();
		this.userrepo = userrepo;
	}
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getName(), registrationDto.getEmail(), 
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_ADMIN")));
		
		return userrepo.save(user);
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		System.out.println("HI");
		BCryptPasswordEncoder encoder = passwordEncoder();
		User user = userrepo.findByEmail(email);
		System.out.println("This is the ..."+email);
		System.out.println("HI");
		
		if (user == null) {
			throw new UsernameNotFoundException("Invalid Username or password");
		}
			
			return new org.springframework.security.core.userdetails.User(user.getEmail(), 
					encoder.encode(user.getPassword()), mapRolesToAuthorities(user.getRoles()));
			
			    
	} 
	
	
	
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    
		}

	
} 
