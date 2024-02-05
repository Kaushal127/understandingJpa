package com.example.undersstandingmapping.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Laptop {

    @Id
    private Long id;

    private String name;
    private String brand;

//    @ManyToOne
//    private Student student;

}
