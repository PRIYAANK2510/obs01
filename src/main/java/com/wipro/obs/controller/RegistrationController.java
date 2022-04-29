package com.wipro.obs.controller;

import com.wipro.obs.entity.AdminAccountDetails;
import com.wipro.obs.entity.CustomerAccountDetails;
import com.wipro.obs.model.AdminModel;
import com.wipro.obs.model.CustomerModel;
import com.wipro.obs.service.AdminService;
import com.wipro.obs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private AdminService adminService;

    @GetMapping("/RegisterCustomer")
    public String RegisterCustomer()
    {
        return "RegisterCustomer";
    }

    @GetMapping("/RegisterAdmin")
    public String RegisterAdmin()
    {
        return "RegisterAdmin";
    }

    @PostMapping("/RegisterCustomer")
    public String registerCustomer(@RequestBody CustomerModel customerModel){
        CustomerAccountDetails customer = customerService.registerCustomer(customerModel);
        return "AdminDashboard";
    }

    @PostMapping("/RegisterAdmin")
    public String registerAdmin(@RequestBody AdminModel adminModel){
        AdminAccountDetails admin = adminService.registerAdmin(adminModel);
        return "AdminDashboard";
    }
}
