package ru.sberbank.hackathonconsumer.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="router")
public class Router {

    @Id
    private Long id;

    private String name;
}
