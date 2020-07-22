package com.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validateFirstName("Riyaz");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validateFirstName("riyaz");
        Assert.assertEquals(true,result);
    }
}
