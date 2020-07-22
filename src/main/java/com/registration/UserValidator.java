package com.registration;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String user_Name= "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String fName) {
        Pattern pattern=Pattern.compile(user_Name);
        return pattern.matcher(fName).matches();
    }
}
