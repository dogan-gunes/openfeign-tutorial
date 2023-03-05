package com.dgn.userDetailservice;

import com.dgn.userDetailservice.model.UserDetail;
import com.dgn.userDetailservice.repository.UserDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class UserDetailServiceApplication implements CommandLineRunner {
    private final UserDetailRepository userDetailRepository;

    public UserDetailServiceApplication(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserDetailServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserDetail user1 = new UserDetail("0555-555-55-55","00000000000","dogan@gmail.com","Çankaya/ANKARA");
        UserDetail user2 = new UserDetail("0333-333-33-33","33333333333","gunes@gmail.com","İncek/ANKARA");
        userDetailRepository.saveAll(Arrays.asList(user1,user2));
    }
}
