package com.test.diego.insfrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @Column(name = "identification_card")
    private String identificationCard;
    @Column(name ="identification_type")
    private String identificationType;
    @Column(name ="first_name")
    private String firstName;
    @Column(name ="middle_name")
    private String middleName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name ="second_sur_name")
    private String secondSurName;
    private String phone;
    private String address;
    private String city;
}
