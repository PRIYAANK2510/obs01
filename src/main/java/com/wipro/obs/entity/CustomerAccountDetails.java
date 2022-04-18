package com.wipro.obs.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CustomerAccountDetails {
    @Id
    private String customerID;
    private String fullName;
    private String fathersName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dob;

    private String gender;
    private String permanentAddress;
    private String presentAddress;
    @Column(unique = true)
    private String panNumber;
    private String mobileNumber;
    private String landlineNumber;
    private String accountType;
    private Long openingBalance;
    @Column(unique = true)
    private Long accountNumber;
    @Column(unique = true)
    private Long cardNumber;

}
