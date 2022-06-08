package com.example.demo.entities;

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
public class Department 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(length = 5)
private int deparId;
@Column(length = 15)
private String deparName;
@OneToOne(targetEntity = Employee.class)
private Employee employee;

@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private StatusReport  statusReport;

@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private Compliance compliance;
}
