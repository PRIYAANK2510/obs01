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
public class BranchDetails {
    @Id
    private String branchId;
    private String branchName;
    private String state;
    private String city;
}
