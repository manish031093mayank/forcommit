package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class StatusReport 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(length = 5)
private int statusId;
@Column(length = 50)
private String comments;
@Column(length = 15)
private String details;
@Column(length = 10)
private LocalDate createDate;
@Column(length = 5)
private int userId;

@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Compliance.class)
private Compliance complaince;

@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Compliance.class)
private Department department;
}
