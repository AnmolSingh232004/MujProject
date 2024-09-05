package com.Muj.Muj.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Disasters")
public class Disaster {

    @Id
    private int id;
    private String name;
    private String location;
    private String casualties;
    private int proximity;
    private String severity;
}