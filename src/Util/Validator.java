package Util;

import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jet
 */

public class Validator {
    public boolean isEmail(String value){
//        Pattern emailPattern = Pattern.compile("^[\\w-].]+@([\\w-]+\\.)+[\\w-]{2,4}$", );
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return emailPattern.matcher(value).find();
        
    }
    
}
