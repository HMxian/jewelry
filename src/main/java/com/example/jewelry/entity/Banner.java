package com.example.jewelry.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "banner")
@Data
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 图片
     */
    private String img;

    /**
     * 权重
     */
    private Integer weight;
}
