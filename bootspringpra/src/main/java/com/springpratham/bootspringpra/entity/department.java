package com.springpratham.bootspringpra.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//all the getter and setters
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message = "department name should not be blank ")
    private String departmentname;
    private String departmentaddress;
    private String departmentCode;


}
