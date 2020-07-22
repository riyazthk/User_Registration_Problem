package com.registration;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String user_Name= "^[A-Z][a-z]{2,}$";
    private static final String email_Id= "^([0-9a-zA-Z/-/_+.]*[@][^.][a-zA-Z]*.[a-z]{2,4}(.[a-z]{2})?)$";
    private static final String ph_Num= "^91[ ][0-9]{10}$";
    private static final String password="^[0-9A-z]{8,}$";


    public boolean validateFirstName(String fName) {
        Pattern pattern=Pattern.compile(user_Name);
        return pattern.matcher(fName).matches();
    }
  
    public boolean validateLastName(String lName) {
        Pattern pattern=Pattern.compile(user_Name);
        return pattern.matcher(lName).matches();

    }

    public boolean validateEmailId(String emailId) {
        Pattern pattern=Pattern.compile(email_Id);
        return pattern.matcher(emailId).matches();
    }


    public boolean validatePhnum(String phNum) {
        Pattern pattern=Pattern.compile(ph_Num);
        return pattern.matcher(phNum).matches();
    }

    public boolean ValidatePassword(String pass) {
        Pattern pattern=Pattern.compile(password);
        return  pattern.matcher(pass).matches();
    }
}
