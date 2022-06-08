package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User 
{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(length = 5)
 private int userId;
 
 @Column(length = 20)
 private String password;
 
 @Column(length = 15)
 private String role;
 
 @Column(length = 15)
 private int result;
 
 @OneToOne(targetEntity = Employee.class)
 private Employee employee;
}
