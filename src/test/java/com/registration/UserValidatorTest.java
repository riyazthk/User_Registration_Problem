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

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Ahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("ahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result=userValidator.validateEmailId("riyaz.ahamed2507@gmail.com.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmailId("riyaz.ahamed@.gmail.com");
        Assert.assertEquals(true,result);

    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhnum("91 8940770823");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNumber_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhnum("918940770823");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordCharacter_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidatePassword("Riyazahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordCharacter_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidatePassword("Riyaz");
        Assert.assertEquals(true,result);
    }
}
