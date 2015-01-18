package com.jh.controller.registration;

import com.jh.service.registration.RegistrationService;

/**
 * Created by Jahangir Alam on 1/18/2015.
 */
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService)
    {
        this.registrationService = registrationService;
    }

    public String doRegistration(String userName, String password, String email)
    {
        if(this.registrationService.doRegistration(userName,password,email).equals("success"))
        {
            return "success";
        }
        return "error";
    }


}
