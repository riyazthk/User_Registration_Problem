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

    @Test
    public void givenPasswordUpperCase_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateUpperCase("Riyazahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordUpperCase_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateUpperCase("riyaz5678");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordNumeric_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateNumeric("r5Agfhamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordNumeric_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateNumeric("riyazahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordSymbol_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateSymbol("r!yazahamed");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPasswordSymbol_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.ValidateSymbol("riyazahamed");
        Assert.assertEquals(true,result);
    }

}
