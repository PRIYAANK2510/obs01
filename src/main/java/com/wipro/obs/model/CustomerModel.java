package com.wipro.obs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {
    private String customerID;
    private String fullName;
    private String fathersName;
    private Date dob;
    private String gender;
    private String permanentAddress;
    private String presentAddress;
    private String panNumber;
    private String mobileNumber;
    private String landlineNumber;
    private String accountType;
    private Long openingBalance;
    private Long accountNUmber;
    private Long cardNumber;
    private String password;
    private String matchingpassword;
}
