package com.wipro.obs.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class AdminAccountDetails {
    @Id
    private String adminId;
    private String name;
    private String mobileNumber;
    private String gender;
    private String password;
}
