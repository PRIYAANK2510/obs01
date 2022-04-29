package com.wipro.obs.validator;

import com.wipro.obs.entity.UserCredentials;
import com.wipro.obs.model.UserCredModel;
import com.wipro.obs.repository.UserCredentialsRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginValidation {
    private UserCredentialsRepository userCredentialsRepository;
    public String authenticate(UserCredModel userCredModel)
    {
        String returnValue = null;
        UserCredentials userCredentials = userCredentialsRepository.findByUserId(userCredModel.getUserId());
        if (userCredentials==null)
        {
            throw new RuntimeException("User does not exist.");
        }
        if(userCredentials.getPassword() == userCredModel.getPassword())
        {
            if(userCredentials.getUserType() == "Admin")
            {
                returnValue = "adminDashboard";
            } else if (userCredentials.getUserType() == "Customer"){
                returnValue = "customerDashboard";
            }
        }
        else{
            throw new RuntimeException("Password Mismatch.");
        }
        return returnValue;
    }
}
