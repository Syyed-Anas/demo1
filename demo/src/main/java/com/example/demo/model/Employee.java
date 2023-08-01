
package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "emp_id")
    private Long empId;

    @Column(name = "empName")
    private String empname;

    @Column( name = "empAge")
    private String empAge;

    public Employee() {
    }

    

    
    public Long getEmpId() {
        return empId;
    }




    public void setEmpId(Long empId) {
        this.empId = empId;
    }




    public String getEmpname() {
        return empname;
    }




    public void setEmpname(String empname) {
        this.empname = empname;
    }




    public String getEmpAge() {
        return empAge;
    }




    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }




    public Address getAddress() {
        return address;
    }




    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empname=" + empname + ", empAge=" + empAge + ", address=" + address
                + "]";
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
}