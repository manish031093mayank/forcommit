package com.example.demo.entities;

import java.time.LocalDate;

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
public class Compliance 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(length = 5)
private int complianceId;

@Column(length = 15)
private String rlType;

@Column(length = 15)
private String details;

@Column(length = 10)
private LocalDate createData;

@OneToOne(targetEntity = Department.class)
private Department department;

@Column(length = 5)
private int empCount;

@Column(length = 5)
private int sisCount;

@Column(length = 15)
private String status;

@OneToOne(targetEntity = StatusReport.class)
private StatusReport statusReport;
}
