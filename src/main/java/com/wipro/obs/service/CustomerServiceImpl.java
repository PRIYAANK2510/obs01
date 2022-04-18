package com.wipro.obs.service;

import com.wipro.obs.entity.CustomerAccountDetails;
import com.wipro.obs.model.CustomerModel;
import com.wipro.obs.repository.CustomerAccountDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerAccountDetailsRepository customerAccountDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public CustomerAccountDetails registerCustomer(CustomerModel customerModel) {
        CustomerAccountDetails customerAccountDetails = new CustomerAccountDetails();

        customerAccountDetails.setCustomerID(customerModel.getCustomerID());
        customerAccountDetails.setFullName(customerModel.getFullName());
        customerAccountDetails.setFathersName(customerModel.getFathersName());
        customerAccountDetails.setDob(customerModel.getDob());
        customerAccountDetails.setGender(customerModel.getGender());
        customerAccountDetails.setPermanentAddress(customerModel.getPermanentAddress());
        customerAccountDetails.setPresentAddress(customerModel.getPresentAddress());
        customerAccountDetails.setPanNumber(customerModel.getPanNumber());
        customerAccountDetails.setMobileNumber(customerModel.getMobileNumber());
        customerAccountDetails.setLandlineNumber(customerModel.getLandlineNumber());
        customerAccountDetails.setAccountType(customerModel.getAccountType());
        customerAccountDetails.setOpeningBalance(customerModel.getOpeningBalance());
        customerAccountDetails.setAccountNumber(customerModel.getAccountNUmber());
        customerAccountDetails.setCardNumber(customerModel.getCardNumber());
        customerAccountDetails.setPassword(passwordEncoder.encode(customerModel.getPassword()));

        customerAccountDetailsRepository.save(customerAccountDetails);
        return customerAccountDetails;
    }
}
