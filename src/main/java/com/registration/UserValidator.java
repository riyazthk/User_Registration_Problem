package com.registration;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String user_Name= "^[A-Z][a-z]{2,}$";
    private static final String email_Id= "^([0-9a-zA-Z/-/_+.]*[@][^.][a-zA-Z]*.[a-z]{2,4}(.[a-z]{2})?)$";


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


}
