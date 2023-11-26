package com.developer.webapp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class RollCast
{
    @Id
    private int EmpID;
    private LocalDate BreakDay;
    private int AddDAy;
    private BigDecimal Total;

}
