package com.apple.shop;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// id 알아서 1씩 증가시켜서 넣어줌
    private Long id;

    private String title;
    private  Integer price;


    //    public String toString(){
//        return this.title + this.price;
}


