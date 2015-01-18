package com.jh.controller.registration;


import com.jh.service.registration.RegistrationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Jahangir Alam on 1/18/2015.
 */
public class RegistrationControllerTest {

    @Mock
    private RegistrationService registrationService;

    @InjectMocks
    private RegistrationController registrationController;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void doRegistrationTest()
    {
        when(registrationService.doRegistration("jh","12","22@gg.com")).thenReturn("success");

        assertEquals("success", registrationController.doRegistration("jh","12","22@gg.com"));

    }
}
