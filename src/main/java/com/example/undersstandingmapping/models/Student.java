package com.example.undersstandingmapping.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Student {

    @Id
    private Long id;

    private String name;
    private String psp;


//    @OneToMany(mappedBy = "student")
//    private List<Laptop> laptops;

}
