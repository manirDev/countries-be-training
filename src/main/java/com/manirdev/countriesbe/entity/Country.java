package com.manirdev.countriesbe.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Country {
    @Id
    private Long id;
    private String name;
    private String nativeName;
    private String phone;
    private String capital;
    private String continent;
    private String currency;
    //en,tr,fr...
   // private List<String> languages;
}
