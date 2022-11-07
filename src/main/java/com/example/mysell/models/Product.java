package com.example.mysell.models;

import lombok.Data;

@Data
public class Product {
    private String title;
    private String description;
    private  int price;
    private String city;
    private String autor;
}
