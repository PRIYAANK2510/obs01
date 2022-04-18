package com.wipro.obs.repository;

import com.wipro.obs.entity.CustomerAccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountDetailsRepository extends JpaRepository<CustomerAccountDetails,String> {
}
