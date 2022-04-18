package com.wipro.obs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
    private String adminId;
    private String name;
    private String mobileNumber;
    private String gender;
    private String password;
    private String matchingpassword;
}
