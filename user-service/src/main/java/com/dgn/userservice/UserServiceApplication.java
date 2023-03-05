package com.dgn.userservice;

import com.dgn.userservice.client.RetreiveMessageErrorDecoder;
import com.dgn.userservice.model.User;
import com.dgn.userservice.repository.UserRepository;
import feign.codec.ErrorDecoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication implements CommandLineRunner {
    private final UserRepository userRepository;

    public UserServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Doğan","GÜNEŞ",1l);
        User user2 = new User("Volkan","ÖZBEK",2l);
        User user3 = new User("Ahmet","GÜNEŞ",3l);
        userRepository.saveAll(Arrays.asList(user1,user2,user3));
    }

    @Bean
    public ErrorDecoder errorDecoder(){
        return new RetreiveMessageErrorDecoder();
    }
}
