package com.jh.service.registration;

/**
 * Created by Jahangir Alam on 1/18/2015.
 */
public interface RegistrationService {

    public String doRegistration(String userName, String password, String email);
    public String validateUserNamePassword(String userName, String password, String email);
}
