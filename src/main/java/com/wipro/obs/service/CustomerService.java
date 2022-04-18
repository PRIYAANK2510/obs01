package com.wipro.obs.service;

import com.wipro.obs.entity.CustomerAccountDetails;
import com.wipro.obs.model.CustomerModel;

public interface CustomerService {
    CustomerAccountDetails registerCustomer(CustomerModel customerModel);
}
