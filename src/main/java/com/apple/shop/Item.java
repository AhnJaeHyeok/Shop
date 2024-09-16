package com.apple.shop;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)// id 알아서 1씩 증가시켜서 넣어줌
    public Long id;

    @Column(nullable = false, unique = true)
    public String title;
    public Integer price;
}


