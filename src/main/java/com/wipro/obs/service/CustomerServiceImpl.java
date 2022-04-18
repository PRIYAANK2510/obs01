package com.wipro.obs.service;

import com.wipro.obs.entity.CustomerAccountDetails;
import com.wipro.obs.entity.UserCredentials;
import com.wipro.obs.model.CustomerModel;
import com.wipro.obs.repository.CustomerAccountDetailsRepository;
import com.wipro.obs.repository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerAccountDetailsRepository customerAccountDetailsRepository;

    @Autowired
    private UserCredentialsRepository userCredentialsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public CustomerAccountDetails registerCustomer(CustomerModel customerModel) {
        CustomerAccountDetails customerAccountDetails = new CustomerAccountDetails();
        UserCredentials userCredentials = new UserCredentials();

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

        userCredentials.setUserId(customerModel.getCustomerID());
        userCredentials.setPassword(passwordEncoder.encode(customerModel.getPassword()));
        userCredentials.setUserType("USER");

        userCredentialsRepository.save(userCredentials);
        customerAccountDetailsRepository.save(customerAccountDetails);
        return customerAccountDetails;
    }
}
