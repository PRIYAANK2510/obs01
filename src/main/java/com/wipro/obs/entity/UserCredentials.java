package com.wipro.obs.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserCredentials {
    @Id
    private String userId;
    private String userType;
    private String password;
}
