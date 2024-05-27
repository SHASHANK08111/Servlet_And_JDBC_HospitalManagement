package com.virtusa.Service;


import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidUsername(String name){
        boolean isValidName = false;
        Pattern pattern = Pattern.compile("[@_!#$%^&*()<>?/|}{~:,-\\_=+]");
        Matcher matcher = pattern.matcher(name);
        if(!(matcher.find())) {
            isValidName = true;
        }
        return isValidName;
    }

    public static boolean isValidEmailAddress(String email){
        boolean isValidEmail = false;
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@'){
                count++;
            }
        }
        System.out.println(count);
        Pattern pattern = Pattern.compile("[!#$%^&*()<>?/|}{~:,_=+\\-]");
        Matcher matcher = pattern.matcher(email);
        System.out.println(email);
        if(!email.contains(" ") && !(matcher.find()) && (count == 1) && email.contains(".com")) {
            isValidEmail = true;
        }
        System.out.println(isValidEmail);
        return isValidEmail;
    }

    public static boolean isValidPassword(String password){
        boolean isValidPass = false;
        boolean isOneLetterCaps = false;
        boolean isOneLetterSmall = false;
        boolean isContainNumber = false;

        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == password.toUpperCase().charAt(i)){
                isOneLetterCaps = true;
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if(password.charAt(i) == password.toLowerCase().charAt(i)){
                isOneLetterSmall = true;
                break;
            }
        }

        Pattern pattern = Pattern.compile("[@!#$%^&*()<>?/|}{~:,-\\_=+]");
        Matcher matcher = pattern.matcher(password);

//        Pattern noPattern = Pattern.compile("[0-9]");
        Matcher noMatcher = pattern.matcher(password);

//        if(noMatcher.find()){
//            isContainNumber = true;
//        }
        if(password.length() >= 8 && password.length() <= 16){
            if(matcher.find() && isOneLetterCaps && isOneLetterSmall){
                isValidPass = true;
            }
        }
        return isValidPass;
    }

    public static boolean isValidPhoneNumber(String phoneNumber){
        boolean isValidNumber = false;

        Pattern pattern = Pattern.compile("[@!#$%^&*()<>?/|}{~:,-\\_=+]");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(phoneNumber.length() == 10 && !(matcher.find())){
            isValidNumber = true;
        }

        return isValidNumber;
    }


    //Appointment Validation
    public static boolean isValidAppointmentDate(Date appointmentDate){
        System.out.println("Appointment Date : " + appointmentDate);
        boolean isValidDate = false;
        Date date = new Date();
        System.out.println("date : " + date);
        if(appointmentDate.after(date)){
            isValidDate = true;
        }
        System.out.println(isValidDate);
        return isValidDate;
    }

    public static boolean isValidAge(int age) {
        if (age > 0 && age < 100) {
            return true;
        }
        return false;
    }

    public static boolean isValidDisease(String Disease){
        System.out.println("inside validation" +Disease);
        String regex = "^[a-zA-Z0-9 ]+$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(Disease).matches();
    }

//    public static void main(String[] args) {
//        System.out.println(isValidUsername("kar-n"));
//        System.out.println(isValidEmailAddress("karn-@gmail.com"));
//        System.out.println(isValidPassword("qazwsxqQ"));
//    }
}
