package com.wipro.obs.service;

import com.wipro.obs.entity.AdminAccountDetails;
import com.wipro.obs.model.AdminModel;

public interface AdminService {
    AdminAccountDetails registerAdmin(AdminModel adminModel);
}
