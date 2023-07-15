package com.springdemo.springexercises.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Builder(setterPrefix = "set")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    private String title;

    @Setter
    private String anons;

    @Setter
    private String text;

    @Setter
    private int view;
}
