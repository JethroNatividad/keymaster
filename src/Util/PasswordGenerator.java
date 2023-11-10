package Util;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jet
 */

public class PasswordGenerator {
    public String generatePassword(int length, boolean includeUpperCase, boolean includeLowerCase, boolean includeDigits, boolean includeSpecialChars) {
        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*";
        
        StringBuilder password = new StringBuilder();
        String chars = "";
        
        Random random = new Random();
        
        // Check if at least one character set is selected
        if (!includeUpperCase && !includeLowerCase && !includeDigits && !includeSpecialChars) {
            throw new IllegalArgumentException("At least one character set must be selected.");
        }
        
        // Include at least one character from each selected character set
        if (includeUpperCase) {
            char randomChar = upperCaseChars.charAt(random.nextInt(upperCaseChars.length()));
            password.append(randomChar);
            chars += upperCaseChars;
        }
        if (includeLowerCase) {
            char randomChar = lowerCaseChars.charAt(random.nextInt(lowerCaseChars.length()));
            password.append(randomChar);
            chars += lowerCaseChars;
        }
        if (includeDigits) {
            char randomChar = digitChars.charAt(random.nextInt(digitChars.length()));
            password.append(randomChar);
            chars += digitChars;
        }
        if (includeSpecialChars) {
            char randomChar = specialChars.charAt(random.nextInt(specialChars.length()));
            password.append(randomChar);
            chars += specialChars;
        }
        
        // Generate remaining characters for the password
        for (int i = password.length(); i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }
        
        // Shuffle the password characters
        for (int i = password.length() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }
        
        return password.toString();
    }
    
}
