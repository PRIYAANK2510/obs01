package com.wipro.obs.service;

import com.wipro.obs.entity.AdminAccountDetails;
import com.wipro.obs.entity.UserCredentials;
import com.wipro.obs.model.AdminModel;
import com.wipro.obs.repository.AdminAccountDetailsRepository;
import com.wipro.obs.repository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminAccountDetailsRepository adminAccountDetailsRepository;

    @Autowired
    private UserCredentialsRepository userCredentialsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public AdminAccountDetails registerAdmin(AdminModel adminModel) {
        AdminAccountDetails adminAccountDetails = new AdminAccountDetails();
        UserCredentials userCredentials = new UserCredentials();

        adminAccountDetails.setAdminId(adminModel.getAdminId());
        adminAccountDetails.setGender(adminModel.getGender());
        adminAccountDetails.setMobileNumber(adminModel.getMobileNumber());
        adminAccountDetails.setName(adminModel.getName());

        userCredentials.setUserId(adminModel.getAdminId());
        userCredentials.setUserType("ADMIN");
        userCredentials.setPassword(passwordEncoder.encode(adminModel.getPassword()));

        userCredentialsRepository.save(userCredentials);
        adminAccountDetailsRepository.save(adminAccountDetails);
        return adminAccountDetails;
    }
}
