package com.example.demo.pojo;

//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "user")
public class User {
    private Long id;
    private String username;
    private String password;
}
