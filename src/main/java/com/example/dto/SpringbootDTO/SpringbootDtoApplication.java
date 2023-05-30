package com.example.dto.SpringbootDTO;

import com.example.dto.SpringbootDTO.model.Location;
import com.example.dto.SpringbootDTO.model.User;
import com.example.dto.SpringbootDTO.repository.LocationRepository;
import com.example.dto.SpringbootDTO.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String[]args) throws Exception {

		Location location = new Location();
		location.setPlace("Pune");
		location.setDescription("Its a great place");
		location.setLongitude(48.5);
		location.setLatitude(30.5);
		locationRepository.save(location);

		User user1= new User();
		user1.setFirstName("Arima");
		user1.setLastName("Kousei");
		user1.setEmail("arima@gmail.com");
		user1.setPassword("arima");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2= new User();
		user2.setFirstName("Kakashi");
		user2.setLastName("Hatake");
		user2.setEmail("hatake@gmail.com");
		user2.setPassword("kakashi");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
